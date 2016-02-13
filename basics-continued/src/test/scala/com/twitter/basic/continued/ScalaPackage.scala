package com.twitter.basic.continued

import org.specs2.mutable.Specification

/**
  * Created by mishrk3 on 2/13/2016.
  */
class ScalaPackageTest extends Specification {

  "variables" should {
    "be accessible using fully qualified name" in {
      com.twitter.basic.continued.ScalaPackage.BLUE mustEqual ("blue")
    }

    "be accessible using fully qualified name" in {
      com.twitter.basic.continued.ScalaPackage.RED mustEqual ("red")
    }
  }

  "functions" should {
    "be accessible using fully qualified name" in {
      com.twitter.basic.continued.ScalaPackage.funct(1) mustEqual (2)
    }
  }

}
