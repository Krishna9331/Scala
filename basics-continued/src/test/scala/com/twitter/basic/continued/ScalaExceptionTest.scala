package com.twitter.basic.continued

import org.mockito.Mockito
import org.specs2.mutable.Specification
import org.specs2.mock.Mockito


/**
  * Created by mishrk3 on 2/13/2016.
  */
class ScalaExceptionTest extends Specification {

  "ScalaException" should {
    "return valid result" in {
      val obj = new ScalaException(1, 2)
      var ans = 0
      obj.result.map { (value: Int) =>
        ans = value
      }
      ans mustEqual 3
    }
    "should contain valid exception" in {
      val obj1 = new ScalaException(0, 2)
      var exception: Any = null
      obj1.result.leftMap { (exp: ServerIsDown) =>
        exception = exp
      }
      exception.isInstanceOf[ServerIsDown] mustEqual true
      exception.asInstanceOf[ServerIsDown].message mustEqual "the remote calculator service is unavailable. should have kept your trusty HP."
    }
  }
}
