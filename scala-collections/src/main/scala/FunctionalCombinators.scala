/**
  * Created by mishrk3 on 2/18/2016.
  */
class FunctionalCombinators {

  val numbers = List(1, 2, 3, 4)

  /**
    * Map iterates over each element of the collection and return a list of same numbers of element by applying mentioned
    * operation. In below case it is multiplying each element by 2.
    */

  numbers.map((i: Int) => i * 2)


  def timesTwo(i: Int) = i * 2

  /**
    * map takes function also as an argument,
    * So here a method is converted to function by scala compiler automatically
    */
  numbers.map(timesTwo)

  /**
    * foreach is same as map bet it returns nothing.
    * It is mostly intended for side effect only
    */
  numbers.foreach((i: Int) => i + 2)

  /**
    * Even we try to store the value of for loop it becomes of Unit types that means void.
    * so doubled: Unit = () is returned
    */
  val doubled = numbers.foreach((i: Int) => i + 2)

  /**
    * along with iterating filter removes all those element which evaluates as false for the passed function in filter.
    * A function which results to boolean is known as predicate function.
    */
  val even = numbers.filter((i: Int) => i % 2 == 0)

  val list1 = List(1, 2, 3)
  val list2 = List("a", "b", "c", "d")

  /**
    * zip combines the value of list together as tuple, here the generate list will be
    * List((1,a), (2,b), (3,c)), notice that the extra value "d" from second list is gone.
    */
  val zippedList = list1.zip(list2)


  /**
    * Partition splits the list on basis of the passed predicate function.
    * On below case it will iterates through all the element and divide it by 2 if it is divisible, that number will be
    * put into separate list. it none of the element satisfy the criteria it will keep all the element as one list and
    * creates an empty list.
    * res1: (List[Int], List[Int]) = (List(2, 4, 6, 8, 10),List(1, 3, 5, 7, 9)) is the generated o/p
    * so basically it has created tuple of two list
    */
  val combinedList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  combinedList.partition(_ % 2 == 0)

  /**
    * find return the first element which satisfy the condition of passed predicate.
    * on below case it will return Some(8). Notice that return type is Some.
    */
  combinedList.find((i: Int) => i % 4 == 0 && i > 5)

  /**
    * drop takes the first n numbers  and drop it from the list.
    * below call will remove 1 to 5 from list and will return List(6, 7, 8, 9, 10)
    */
  combinedList.drop(5)

  /**
    * dropWhile deletes the elements until the elements starting from first match predicate passed as argument of dropWhile.
    * below call will remove noting nothing from list as first element 1 itself doesn't pass the criteria.
    */
  combinedList.dropWhile((i: Int) => i % 2 == 0)

  /**
    * here 0 is starting value and m acts as accumulator
    * m: 0 n: 1
    * m: -1 n: 2
    * m: -3 n: 3
    * m: -6 n: 4
    * m: -10 n: 5
    * m: -15 n: 6
    * m: -21 n: 7
    * m: -28 n: 8
    * m: -36 n: 9
    * m: -45 n: 10
    * res0: Int = -55
    */
  combinedList.foldLeft(0)((m: Int, n: Int) => m - n)

  /**
    * folRight does it just from the opposite end.
    * In this case also O is starting value but accumulator is n
    *
    * m: 10 n: 0
    * m: 9 n: 10
    * m: 8 n: -1
    * m: 7 n: 9
    * m: 6 n: -2
    * m: 5 n: 8
    * m: 4 n: -3
    * m: 3 n: 7
    * m: 2 n: -4
    * m: 1 n: 6
    * res0: Int = -5
    */
  combinedList.foldRight(0)((m: Int, n: Int) => m - n)

  /*Important Observation
  *
  * Fold left and fold right does not matter much in case of Monoids.
  * Because it holds law of Associativity and Identity.
  *
  * Suppose we have input as
  * val words = List("Hic", "Est", "Index")
  *
  * Below are the how both fold left and fold right will operate on above list
  *
  * words.foldLeft("")(_ + _) == (("" + "Hic") + "Est") + "Index"
  * words.foldRight("")(_ + _) == "Hic" + ("Est" + ("Index" + ""))
  *
  * */

  val firstList = List(1, 2, 3)
  val secondList = List(5, 7, 9)
  val thirdList = List((6, "Six"), (8, "Eight"))

  val finalList = List(firstList, secondList, thirdList)
  /**
    * flatten collapse one level of nested structure
    * Below code will o/p as List(1, 2, 3, 5, 7, 9, (6,Six), (8,Eight))
    */
  finalList.flatten

  /**
    * flatMap is frequently used combinator that combines mapping and flattening. It takes a function which works on the
    * concatenated list and combines them back together.
    * Below code will o/p List(2, 4, 6, 10, 14, 18)
    */
  val finalList1 = List(firstList, secondList)
  finalList1.flatMap(x => x.map(_ * 2))

  /**
    * doing above using map and flatten
    */

  finalList1.map((x: List[Int]) => x.map(_ * 2)).flatten

  /**
    * own customize combinator
    *
    * @param num List of Integer
    * @param fn  function to be applied on integer
    * @return a list after applying fn on each element of the num
    *
    *         on below code we have to pass List[Int]() to say scala that we need an empty list to accumulate the result
    */
  def ourMap(num: List[Int], fn: Int => Int): List[Int] = {
    num.foldRight(List[Int]()) { (x: Int, xs: List[Int]) =>
      fn(x) :: xs
    }
  }

  /**
    * For with yield works as flatmap
    * so the generated o/P will be List(6, 8, 10)
    */

  val num = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  for {
    a <- num
    if a % 2 == 0; if a > 5
  }yield a

}
