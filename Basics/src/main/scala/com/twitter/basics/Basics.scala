package com.twitter.basics

/**
  * Created by mishrk3 on 2/4/2016.
  */

/**
  * This class is designed as per Scala-School of twitter bootstrap
  * Basic class.
  * The actual usage of the defined functions can be found in test package
  */
class Basics {
  /**
    * The scala automatically decides the return type of the method, However, it is
    * mandatory to give type in arguments
    *
    * @param m and Integer
    * @return an Integer by adding one into it
    */
  def addOne(m: Int) = m + 1

  /**
    * This is how anonymous function is defined and stored in val for future use.
    * Mostly anonymous function is used to pass around.
    * This method add 2 into the argument passed into it
    */
  val addTwoAnonymous = (x: Int) => x + 2

  /**
    * Partial application is the function which gets applied partially.
    * Here a function is defined with underscore.
    */

  def adder(m: Int, n: Int) = m + n

  //Now we can create partial function as below

  val add2 = adder(2, _: Int)

  val add3 = adder(_: Int, 3)

  /**
    * Currying is converting a single function of n arguments into n functions with a single argument each.
    * so f(x,y,z) { z(x(y));} will become function f(x) { lambda(y) { lambda(z) { z(x(y)); } } }
    *
    * on below code since multiply has two argument so the method curredmultiplier will be executed as
    * curriedMultiplier(firstArgs)(secondArgs)
    */

  def multiply(m: Int, n: Int) = m * n
  def curriedMultiplier = (multiply _).curried

  /**
    * variable length argument method
    */

  def capitalizeAll(args: String*) = {
    args.map { arg =>
      arg.capitalize
    }
  }
}
