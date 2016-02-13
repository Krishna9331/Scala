package com.twitter.basic.continued

/**
  * Created by mishrk3 on 2/13/2016.
  */


/**
  * The magical thing with the case class is a companion object is defined automatically by default with apply method
  * which calls the new method.
  * Hence we don't need to separately call new keyword for case class.
  * on below case Calculator("hp", "20b") will create object of the class.
  * In actually the apply method got called with argument which created the object for the case class Calculator.
  *
  * @param brand first arg that constructor of class takes
  * @param model second arg for the construct
  */
case class Calculator(brand: String, model: String) {
}

class PattenMatchingUsingCaseClass {
  /**
    * case class is really helpful in such cases as we don't have to separately create the object and then fit into the
    * case for comparison.
    * Here last case condition is for handling the default condition
    *
    * @param calc the calculator object for matching
    * @return type of calculator passed
    */
  def calcType(calc: Calculator) = calc match {
    case Calculator("hp", "20B") => "financial"
    case Calculator("hp", "48G") => "scientific"
    case Calculator("hp", "30B") => "business"
    case Calculator(ourBrand, ourModel) => "Calculator: %s %s is of unknown type".format(ourBrand, ourModel)
  }

  /**
    * Pattern matching using wildcard in place of actual value
    *
    * @param calc object to be matched
    * @return type of calculator passed for pattern matching
    */
  def calcTypeWildCard(calc: Calculator) = calc match {
    case Calculator("hp", "20B") => "financial"
    case Calculator("hp", "48G") => "scientific"
    case Calculator("hp", "30B") => "business"
    case Calculator(_, _) => "Calculator is of unknown type"
  }

  /**
    * Doing Patten matching using wild card in another way
    *
    * @param calc object to be matched
    * @return type of calculator
    */
  def calcTypeSingleWildCard(calc: Calculator) = calc match {
    case Calculator("hp", "20B") => "financial"
    case Calculator("hp", "48G") => "scientific"
    case Calculator("hp", "30B") => "business"
    case _ => "Calculator is of unknown type"
  }

  /**
    * Pattern matching using rebinding
    *
    * @param calc object to be matched
    * @return type of the calculator
    */
  def calcTypeReBinding(calc: Calculator) = calc match {
    case Calculator("hp", "20B") => "financial"
    case Calculator("hp", "48G") => "scientific"
    case Calculator("hp", "30B") => "business"
    case c@Calculator(_, _) => "Calculator: %s is of unknown type".format(c)
  }
}
