package com.twitter.basic.continued

/**
  * Created by mishrk3 on 2/13/2016.
  */
class ScalaPatternMatching {

  /**
    * Example of match by value, comparison happens directly with value
    *
    * @param exp pattern to match
    * @return String containing the english of number
    */
  def matchPattern(exp: Int) = {
    exp match {
      case 1 => "One"
      case 2 => "Two"
      case _ => "Some other number"
    }
  }

  /**
    * match by guard, here value us stored first in guard here it is i
    *
    * @param exp need to be matched
    * @return String containing english meaning of number
    */
  def matchGuardPattern(exp: Int) = {
    exp match {
      case i if i == 1 => "One"
      case i if i == 2 => "Two"
      case _ => "Some other number"
    }
  }

  /**
    * match by type, here it handles multiple types differently
    *
    * @param o type to be matched
    * @return Any value same as type passed
    */
  def matchTypePattern(o: Any): Any = {
    o match {
      case i: Int if i < 0 => i - 1
      case i: Int => i + 1
      case d: Double if d < 0.0 => d - 0.1
      case d: Double => d + 0.1
      case text: String => text + "s"
    }
  }
}
