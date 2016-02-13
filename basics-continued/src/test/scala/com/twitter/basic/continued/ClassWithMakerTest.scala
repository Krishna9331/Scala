package com.twitter.basic.continued

import org.specs2.mutable.Specification

/**
  * Created by mishrk3 on 2/11/2016.
  */
class ClassWithMakerTest extends Specification {

  "FooMaker" should {
    "create new object of Foo" in {
      FooMaker().isInstanceOf[Foo] mustEqual (true)
    }
  }

  "Bar" should {
    "apply should return 5" in {
      val bar = new Bar
      bar() mustEqual (5)
    }

    "companion object should return" in {
      val bar = Bar()
      bar.isInstanceOf[Bar] mustEqual (true)
    }
  }

}
