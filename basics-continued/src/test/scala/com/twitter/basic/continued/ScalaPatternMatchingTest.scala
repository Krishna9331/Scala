package com.twitter.basic.continued

import org.specs2.mutable.Specification

/**
  * Created by mishrk3 on 2/13/2016.
  */
class ScalaPatternMatchingTest extends Specification {
  "PatternMatching" should {
    val obj = new ScalaPatternMatching
    "give expected result for matchGuardPattern" in {
      obj.matchGuardPattern(1) mustEqual "One"
      obj.matchGuardPattern(2) mustEqual "Two"
      obj.matchGuardPattern(4) mustEqual "Some other number"
    }
    "give expected result for matchPattern" in {
      obj.matchPattern(1) mustEqual "One"
      obj.matchPattern(2) mustEqual "Two"
      obj.matchPattern(4) mustEqual "Some other number"
    }
    "give expected result for matchTypePattern" in {
      obj.matchTypePattern(-2) mustEqual -3
      obj.matchTypePattern(2) mustEqual 3
      obj.matchTypePattern(-0.3) mustEqual -0.4
      obj.matchTypePattern(0.3) mustEqual 0.4
      obj.matchTypePattern("Krishna") mustEqual "Krishnas"
    }
  }

  "matchPattern" should {
    val obj = new ScalaPatternMatching
    "give same resuly as matchGuardPattern" in {
      obj.matchPattern(1) mustEqual obj.matchGuardPattern(1)
      obj.matchPattern(2) mustEqual obj.matchGuardPattern(2)
      obj.matchPattern(4) mustEqual obj.matchGuardPattern(4)
    }
  }
}
