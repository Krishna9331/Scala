package com.twitter.basic.continued

/**
  * Created by mishrk3 on 2/13/2016.
  */

/**
  * In scala when we say function it represents the set of traits.
  * a function that takes one argument is an instance of a Function1 trait.
  * Scala has Function0 to Function 22, this means it accepts max 22 number of arguments.
  *
  * Once we call a function we indirectly call the apply() method defined in the traits (Function1 in this case)
  *
  * In below code we are defining addOne module which will take one integer argument and will return another integer.
  * Which is a function
  */
object addOne extends Function1[Int, Int] {

  /**
    *
    * @param m it is the argument that function takes
    * @return return an integer which function addOne suppose to return
    */
  override def apply(m: Int): Int = m + 1
}

/**
  * A class can also extends a function
  */
class PlusOne extends Function1[Int, Int] {

  /**
    *
    * @param m parameter which Function1 accepts
    * @return returns an integer
    */
  override def apply(m: Int): Int = m + 1
}

/**
  * Below is shorthand for extending the Function1
  */
class AddTwo extends (Int => Int) {

  /**
    *
    * @param m argument for the Function1
    * @return return and Integer after successful execution
    */
  override def apply(m: Int) = m + 2
}