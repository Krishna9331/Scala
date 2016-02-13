package com.twitter.basic.continued

import scalaz.{\/-, -\/, \/}

/**
  * Created by mishrk3 on 2/13/2016.
  */
class ScalaException(m: Int, n: Int) {

  /**
    * use of disjunction is important for the code which is expected to throw exception.
    * It returns always a valid object. It behaves as a container which either contains the error or
    * the valid value after execution.
    *
    * try is expression based that is the reason it is being directly assigned to a variable.
    */
  val result: \/[ServerIsDown, Int] = try {
    val ans = CalculatorService("hp").doCalculation(m, n)
    \/-(ans)
  } catch {
    case e: ServerIsDown => -\/(e)
  } finally {
    RemoteCalculatorService("hp").close()
  }
}

case class CalculatorService(brand: String) {
  def doCalculation(m: Int, n: Int) = {
    if (m == 0) {
      throw new ServerIsDown("the remote calculator service is unavailable. should have kept your trusty HP.")
    }
    m + n
  }
}

case class RemoteCalculatorService(brand: String) {
  def close() = 1
}

case class ServerIsDown(message: String) extends RuntimeException {
}
