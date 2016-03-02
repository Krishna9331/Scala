import org.specs2.mutable.Specification

/**
  * Created by mishrk3 on 2/20/2016.
  */
class FunctionalCombinatorTest extends Specification {

  "map operation" should {
    "apply defined function on each element of list" in {
      val list = List(2, 5, 6, 7)
      val resultList = list.map((i: Int) => i * 3)
      resultList.size mustEqual 4
      resultList.head mustEqual 6
      resultList.tail.head mustEqual 15
    }
  }

  "foreach operation" should {
    "not return any value" in {
      val list = List(2, 5, 6, 7)
      val resultList = list.foreach((i: Int) => i * 3)
      resultList.isInstanceOf[Unit] mustEqual true
    }
  }

  "filter operation" should {
    "remove value not satisfying predicate" in {
      val list = List(2, 5, 6, 7)
      val resultList = list.filter((i: Int) => i % 2 == 0)
      resultList.size mustEqual 2
      resultList.head mustEqual 2
      resultList.tail.head mustEqual 6
    }
  }

  "zip operation" should {
    "aggregate the content of lists" in {
      val list1 = List(2, 5, 6, 7)
      val list2 = List("One", 5.8, 6)
      val resultList = list1.zip(list2)
      resultList.size mustEqual 3
      resultList.head mustEqual 2 -> "One"
      resultList.tail.head mustEqual 5 -> 5.8
    }
  }

  "partition operation" should {
    "split the content of lists on basis of predicate" in {
      val combinedList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
      val resultList = combinedList.partition(_ % 2 == 0)
      resultList mustEqual(List(2, 4, 6, 8, 10), List(1, 3, 5, 7, 9))
      resultList mustEqual List(2, 4, 6, 8, 10) -> List(1, 3, 5, 7, 9)
      resultList._1 mustEqual List(2, 4, 6, 8, 10)
    }
    "create empty list together with original if no element pass predicate" in {
      val combinedList = List(6, 7, 8, 9, 10)
      val resultList = combinedList.partition(_ > 20)
      resultList mustEqual List() -> List(6, 7, 8, 9, 10)
      resultList._1 mustEqual List()
    }
  }

  "find operation" should {
    "return Some if value exist" in {
      val list1 = List(2, 5, 6, 7)
      val result = list1.find(_ % 2 == 0)
      result.isInstanceOf[Some[Int]] mustEqual true
    }
    "return None if value does not exist" in {
      val list1 = List(2, 5, 6, 7)
      val result = list1.find(_ % 11 == 0)
      result mustEqual None
    }
    "return first element matching predicate" in {
      val list1 = List(2, 5, 6, 7)
      val result = list1.find(_ % 2 == 0)
      result.get mustEqual 2
      val res = list1.find((i: Int) => i % 2 == 0 && i > 3)
      res.get mustEqual 6
    }
  }

  "drop operation" should {
    "remove first passed n numbers" in {
      val list1 = List(2, 5, 6, 7)
      val resultList = list1.drop(2)
      resultList.size mustEqual 2
      resultList.head mustEqual 6
      resultList.tail.head mustEqual 7
    }
  }

  "dropWhile operation" should {
    "remove the elements until the elements starting from first match predicate" in {
      val list1 = List(1, 2, 4, 5, 3, 6, 7)
      val resultList = list1.dropWhile(_ < 5)
      resultList.size mustEqual 4
      resultList.head mustEqual 5
      resultList.tail.head mustEqual 3
    }
  }

  "foldLeft operation" should {
    "accumulate the list content from left to right" in {
      val list1 = List("I", " am", " a", " good", " boy")
      val combinedString = list1.foldLeft("")((m: String, n: String) => m + n)
      combinedString mustEqual "I am a good boy"
    }

    "accumulate the list content from left to right" in {
      val list1 = List(1, 2, 3, 4, 5)
      val combinedString = list1.foldLeft(0) { (m: Int, n: Int) => m + n }
      combinedString mustEqual 15
    }
  }

  "foldRight operation" should {
    "accumulate the list content from right to right" in {
      val list1 = List("I", " am", " a", " good", " boy")
      val combinedString = list1.foldRight("") { (m: String, n: String) => m + n }
      combinedString mustEqual "I am a good boy"
    }

    "accumulate the list content from left to right" in {
      val list1 = List(1, 2, 3, 4, 5)
      val combinedString = list1.foldRight(0) { (m: Int, n: Int) => m + n }
      combinedString mustEqual 15
    }
  }

  "flatten" should {
    "combines the list together to first level" in {
      val firstList = List(1, 2, 3)
      val secondList = List(5, 7, 9)
      val thirdList = List((6, "Six"), (8, "Eight"))

      val finalList = List(firstList, secondList, thirdList)
      finalList.flatten mustEqual List(1, 2, 3, 5, 7, 9, (6, "Six"), (8, "Eight"))
    }
  }

  "flat map" should {
    "combines the list together after applying functions" in {
      val firstList = List(1, 2, 3)
      val secondList = List(5, 7, 9)

      val finalList = List(firstList, secondList)
      finalList.flatMap(x => x.map(_ * 2)) mustEqual List(2, 4, 6, 10, 14, 18)
    }
  }

  "for yield" should {
    "generate the collection on basis if condition" in {
      val num = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

      val numList = for {
        a <- num
        if a % 2 == 0; if a > 5
      } yield a

      numList mustEqual List(6, 8, 10)
    }

  }
}
