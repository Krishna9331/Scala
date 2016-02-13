package com.twitter.basic.continued

/**
  * Created by mishrk3 on 2/13/2016.
  */

/**
  * All the variables and functions declared here are inside the package.
  */
object ScalaPackage {

  /**
    * object is considered as module in scala, because designer has considered object as module system.
    * It is mostly useful to access the static variables.
    *
    * These variables can be directly accessed using fully qualified name e.g:
    * com.twitter.basic.continued.BLUE
    */
  val BLUE = "blue"
  val RED = "red"

  val funct = (m: Int) => m + 1;
}
