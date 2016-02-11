package com.twitter.basics

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

/**
  * Created by mishrk3 on 2/11/2016.
  */
@RunWith(classOf[JUnitRunner])
class AbstractClassTest extends Specification {

  "Circle" should {
    "calculate area" in {
      val circle = new Circle(4, "circle");
      circle.getArea() mustEqual (48)
    }
  }

}
