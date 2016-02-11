package com.twitter.basics

import org.specs2.mutable._
import org.specs2.runner._
import org.junit.runner._

import scala.collection.mutable.ArrayBuffer

/**
  * Created by mishrk3 on 2/4/2016.
  */

@RunWith(classOf[JUnitRunner])
class BasicsTest extends Specification {

  "addOne" should {
    val basic = new Basics
    "add 1 to positive number" in {
      basic.addOne(3) mustEqual (4)
    }
    "add 1 to negative number" in {
      basic.addOne(-3) equals (-2)
    }
    "add 1 to zero" in {
      basic.addOne(0) equals (1)
    }
  }

  "addTwoAnonymous" should {
    val basic = new Basics
    "add 2 to positive number" in {
      basic.addTwoAnonymous(3) mustEqual (5)
    }
    "add 2 to negative number" in {
      basic.addTwoAnonymous(-3) equals (-1)
    }
    "add 2 to zero" in {
      basic.addTwoAnonymous(0) equals (2)
    }
  }

  "add2" should {
    val basic = new Basics
    "add 2 to positive number" in {
      basic.add2(3) mustEqual (5)
    }
    "add 2 to negative number" in {
      basic.add2(-3) equals (-1)
    }
    "add 2 to zero" in {
      basic.add2(0) equals (2)
    }
  }

  "add3" should {
    val basic = new Basics
    "add 3 to positive number" in {
      basic.add3(3) mustEqual (6)
    }
    "add 3 to negative number" in {
      basic.add3(-3) equals (0)
    }
    "add 3 to zero" in {
      basic.add3(0) equals (3)
    }
  }

  "curriedMultiplier" should {
    val basic = new Basics
    "multiply two positive number" in {
      basic.curriedMultiplier(3)(1) mustEqual (3)
    }
    "multiply two negative number" in {
      basic.curriedMultiplier(-3)(-2) equals (6)
    }
    "multiply one positive and one negative number" in {
      basic.curriedMultiplier(-3)(2) equals (-6)
    }
    "multiply a number with zero" in {
      basic.curriedMultiplier(0)(2) equals (0)
    }
  }

  "capitalizeAll variable argument" should {
    val basic = new Basics
    "convert to upper case one arg" in {
      basic.capitalizeAll("i") mustEqual ArrayBuffer("I")
    }
    "convert to upper case two arg" in {
      basic.capitalizeAll("I", "am") equals ArrayBuffer("I", "Am")
    }
    "convert to upper case three arg" in {
      basic.capitalizeAll("i", "aM", "Krishna") equals ArrayBuffer("I", "AM", "Krishna")
    }
  }

}
