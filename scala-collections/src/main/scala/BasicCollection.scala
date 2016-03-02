/**
  * Created by mishrk3 on 2/17/2016.
  */
class BasicCollection {

  val numberList = List(1, 2, 3, 4)

  val numberSet = Set(4, 5, 6)

  /**
    * Tuple groups the two element without using any class. Unlike class it does not has named accessors
    * hence it is accessed using ._1 and ._2. in this case hostPort._1 and hostPort._2
    */
  val hostPort = ("localhost", 80)

  /**
    * Special way of making tuple
    */
  val serverPort = "server" -> 8080

  /**
    * Map can be considered as one or more combination of Tuple2
    */
  val map = Map(1 -> "One", 2 -> "Two")

  //another way of defining map
  val map2 = Map((1, "One"), (2, "Two"))

  //Option --------------------------------------------
  /**
    * It is container that may or may not hold something, it is defined as below:
    *
    * trait Option[T]{
    * def isDefined:Boolean
    * def get: T
    * def getOrElse(t: T) : T
    * }
    * It has two subclass Some[T] or None
    */


  val value = map.get(1)
  /**
    * The get method of Map return Some hence we have to use get operation on the returned value.
    * However the method getOrElse sets the default value for us, it means if the Option or Some container
    * does not has any value it will return the passed value as default.
    */
  map.get(1).getOrElse(0);


  /**
    * Use of Option as pattern match
    */
  map.get(1) match {
    case Some(n) => n + " present"
    case None => "Blank"
  }
}
