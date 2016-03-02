import org.specs2.mutable.Specification

/**
  * Created by mishrk3 on 2/20/2016.
  */
class BasicCollectionTest extends Specification {

  "List" should {
    val list = List(1, 2, 4, 6)
    "fetch first value using head" in {
      list.head mustEqual 1
    }
    "drop first element using tail" in {
      list.tail.size mustEqual 3
      list.tail.head mustEqual 2
    }
  }

  "Set" should {
    val set = Set(1, 4, 5, 7)
    "fetch first value using head" in {
      set.head mustEqual 1
    }
    "drop first element using tail" in {
      set.tail.size mustEqual 3
      set.tail.head mustEqual 4
    }
  }

  "Tuple" should {
    val tup1 = ("Five", 5)
    val tup2 = "Five" -> 5
    "create equal tuple using different way" in {
      tup1 mustEqual tup2
    }
    "contain same value" in {
      tup1._1 mustEqual tup2._1
      tup1._2 mustEqual tup2._2
    }
  }

  "Map" should {
    val map1 = Map(("Five", 5))
    val map2 = Map("Five" -> 5)
    "combine tuple using different way" in {
      map1 mustEqual map2
    }
    "contain same key value pair" in {
      map1.get("Five").get mustEqual 5
      map2.get("Five").get mustEqual 5
    }
  }

  "Option" should {
    val map2 = Map("Five" -> 5, "Two" -> 2)
    "be returned on Map.get" in {
      map2.get("Five").isInstanceOf[Option[Int]] mustEqual true
    }
    "return Some if value exists" in {
      map2.get("Five").isInstanceOf[Some[Int]] mustEqual true
    }
    "return None if no value exist" in {
      map2.get("Six") mustEqual None
    }
    "return true on isDefined if value exist" in {
      map2.get("Five").isDefined mustEqual true
    }
    "set default value using getOrElse if no value exist" in {
      map2.get("Five").getOrElse(2) mustEqual 5
      map2.get("Six").getOrElse(2) mustEqual 2
    }
  }
}
