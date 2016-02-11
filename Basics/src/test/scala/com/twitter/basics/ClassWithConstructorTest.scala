package com.twitter.basics

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

/**
  * Created by mishrk3 on 2/11/2016.
  */
@RunWith(classOf[JUnitRunner])
class ClassWithConstructorTest extends Specification {

  "constructor" should {
    "create object with 'HP' args and blue color " in {
      val constructorClass = new ClassWithConstructor("HP")
      constructorClass.color mustEqual ("blue")
    }

    "create object with 'TI' args and black color " in {
      val constructorClass = new ClassWithConstructor("TI")
      constructorClass.color mustEqual ("black")
    }

    "create object with 'CISCO' args and white color " in {
      val constructorClass = new ClassWithConstructor("CISCO")
      constructorClass.color mustEqual ("white")
    }
  }

  "method" should {
    "be called with argument" in {
      val exp = new Expression
      exp.add(2, 3) mustEqual (5)
    }
  }

  "Function" should {
    "can be called without argument" in {
      val exp = new Expression
      //we can not call method like below line
      exp.fnc
      exp.fnc(2, 3) mustEqual (5)
    }
  }

}
