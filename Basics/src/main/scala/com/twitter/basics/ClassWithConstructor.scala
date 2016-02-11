package com.twitter.basics

/**
  * Created by mishrk3 on 2/11/2016.
  */

/**
  *
  * @param brand argument for constructor
  */
class ClassWithConstructor(brand: String) {

  /**
    * defining constructor for class
    */

  val color: String = if (brand == "HP") {
    "blue"
  } else if (brand == "TI") {
    "black"
  } else {
    "white"
  }
}


class Expression{
  /**
    * The method generally gets defined using def key word
    * and it always expect body after this.
    *
    * @param m first integer to be added
    * @param n second integer to be added
    * @return an integer we get after addition of above two
    */
  def add(m: Int, n: Int) = m + n

  /**
    * below is a function not a method generally a function signature is
    * (arg1, arg2, ..) => Unit
    */
  val fnc = { (m: Int, n: Int) => m + n }
}
