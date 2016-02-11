package com.twitter.basics

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

/**
  * Created by mishrk3 on 2/11/2016.
  */
@RunWith(classOf[JUnitRunner])
class ScalaInheritanceTest extends Specification {

  "Point.move" should {
    "return a new point object with passed coordinate" in {
      val pt = new Point(1, 2).move(3, 5)
      pt.x mustEqual (4)
      pt.y mustEqual (7)
    }
    "color point " in {
      val pt = new ColorPoint(1, 2, "green").move(3, 7)
      pt.color mustEqual ("green")
      pt.x mustEqual (4)
    }
    "color point overload method" in {
      val ptOver = new ColorPoint(5, 2, "green").move(3)
      ptOver.color mustEqual ("green")
      ptOver.x mustEqual (8)
      ptOver.y mustEqual (2)
    }
  }

  "comparison" should {
    "return true" in {
      val colorPoint = new ColorPoint(1, 2, "green")
      val colorPoint1 = new ColorPoint(1, 2, "green")
      colorPoint.compareWith(colorPoint1) mustEqual (true)
    }
    "return false" in {
      val colorPoint = new ColorPoint(1, 3, "green")
      val colorPoint1 = new ColorPoint(1, 2, "green")
      colorPoint.compareWith(colorPoint1) mustEqual (false)
    }
    "return false" in {
      val colorPoint = new ColorPoint(3, 2, "green")
      val colorPoint1 = new ColorPoint(1, 2, "green")
      colorPoint.compareWith(colorPoint1) mustEqual (false)
    }
    "return false" in {
      val colorPoint = new ColorPoint(1, 2, "blue")
      val colorPoint1 = new ColorPoint(1, 2, "green")
      colorPoint.compareWith(colorPoint1) mustEqual (false)
    }
    "return false" in {
      val colorPoint = new ColorPoint(3, 4, "blue")
      val colorPoint1 = new ColorPoint(1, 2, "green")
      colorPoint.compareWith(colorPoint1) mustEqual (false)
    }
  }

}
