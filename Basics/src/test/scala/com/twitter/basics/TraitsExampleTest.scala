package com.twitter.basics

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

/**
  * Created by mishrk3 on 2/11/2016.
  */
@RunWith(classOf[JUnitRunner])
class TraitsExampleTest extends Specification {
  "BMW" should {
    "inherit the property" in {
      val car = new BMW
      car.highestSpeed mustEqual (290)
      car.brand mustEqual ("BMW")
      car.shineRefraction mustEqual (12)
    }
  }
}
