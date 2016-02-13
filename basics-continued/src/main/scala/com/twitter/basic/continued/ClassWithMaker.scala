package com.twitter.basic.continued

/**
  * Created by mishrk3 on 2/11/2016.
  */
class Foo {
}

/**
  * apply() method is mostly used when a class or object has one main use
  */
object FooMaker {
  def apply() = new Foo
}

class Bar {
  /**
    * calling apply() looks like calling a method over object e.g
    * val bar = new Bar
    * and bar() will call apply() method
    *
    * @return and integer
    */
  def apply() = 5;
}

/**
  * object is mostly used for holding single instance of class, Often used for factories
  * if object name is same as class it is called "Companion Object"
  * below object class removes need
  */
object Bar {
  def apply() = new Bar
}