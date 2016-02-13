package com.twitter.basic.continued

import org.specs2.mutable.Specification

/**
  * Created by mishrk3 on 2/13/2016.
  */
class CaseClassTest extends Specification {

  "Pattern matching using case class" should {

    val hp20b = Calculator("hp", "20B")
    val hp48g = Calculator("hp", "48G")
    val hp30b = Calculator("hp", "30B")
    val unknown = Calculator("IT", "90S")

    val obj = new PattenMatchingUsingCaseClass

    "return expected calc type in calcType" in {
      obj.calcType(hp20b) mustEqual "financial"
      obj.calcType(hp48g) mustEqual "scientific"
      obj.calcType(hp30b) mustEqual "business"
      obj.calcType(unknown) mustEqual "Calculator: IT 90S is of unknown type"
    }
    "return expected calc type in calcTypeWildCard" in {
      obj.calcTypeWildCard(hp20b) mustEqual "financial"
      obj.calcTypeWildCard(hp48g) mustEqual "scientific"
      obj.calcTypeWildCard(hp30b) mustEqual "business"
      obj.calcTypeWildCard(unknown) mustEqual "Calculator is of unknown type"
    }
    "return expected calc type in calcTypeSingleWildCard" in {
      obj.calcTypeSingleWildCard(hp20b) mustEqual "financial"
      obj.calcTypeSingleWildCard(hp48g) mustEqual "scientific"
      obj.calcTypeSingleWildCard(hp30b) mustEqual "business"
      obj.calcTypeSingleWildCard(unknown) mustEqual "Calculator is of unknown type"
    }
    "return expected calc type in calcTypeReBinding" in {
      obj.calcTypeReBinding(hp20b) mustEqual "financial"
      obj.calcTypeReBinding(hp48g) mustEqual "scientific"
      obj.calcTypeReBinding(hp30b) mustEqual "business"
      obj.calcTypeReBinding(unknown) mustEqual "Calculator: Calculator(IT,90S) is of unknown type"
    }
  }
}
