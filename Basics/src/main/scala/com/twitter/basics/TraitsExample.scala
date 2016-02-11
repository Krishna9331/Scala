package com.twitter.basics

/**
  * Created by mishrk3 on 2/11/2016.
  */
trait Car {
  val brand: String
}

trait Shiny {
  val shineRefraction: Int
}

trait Speed {
  val highestSpeed: Int
}

/**
  * A class can extend multiple traits
  * however it can extend only one class.
  *
  * The selection between abstract class and traits depends if we need propety from multiple traits
  * or we need constructor implementation.
  * for the case of trait trait t(i: Int) is invalid
  */
class BMW extends Car with Shiny with Speed {
  override val brand: String = "BMW"
  override val shineRefraction: Int = 12
  override val highestSpeed: Int = 290
}
