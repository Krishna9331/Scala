package com.twitter.basics

/**
  * Created by mishrk3 on 2/11/2016.
  */
abstract class Shape(name: String) {
  def getArea(): Int
}


/**
  * Here it is mandatory that child class must have the constructor arg required for the parent class
  *
  * @param r    is the extra constructor arg that Circle class will take
  * @param name parameter required for parent class Shape
  */
class Circle(r: Int, name: String) extends Shape(name: String) {
  override def getArea() = r * r * 3
}
