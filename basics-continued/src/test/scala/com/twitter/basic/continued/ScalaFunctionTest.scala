package com.twitter.basic.continued

import org.specs2.mutable.Specification

/**
  * Created by mishrk3 on 2/13/2016.
  */
class ScalaFunctionTest extends Specification {

  "addOne" should {
    "add 1 to passed argument" in {
      addOne(1) mustEqual (2)
    }
  }

  "PlusOne" should {
    "add 1 to passed argument" in {
      val plusOne = new PlusOne
      plusOne(1) mustEqual (2)
    }
  }

  "AddTwo" should {
    "add 1 to passed argument" in {
      val addTwo = new AddTwo
      addTwo(1) mustEqual (3)
    }
  }

}
