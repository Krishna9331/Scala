package com.twitter.basics

/**
  * Created by mishrk3 on 2/11/2016.
  */
class Point(xc: Int, yc: Int) {

  val x: Int = xc
  val y: Int = yc

  def move(dx: Int, dy: Int): Point = new Point(x + dx, y + dy)

}

class ColorPoint(u: Int, v: Int, c: String) extends Point(u, v) {
  val color: String = c

  def compareWith(pt: ColorPoint): Boolean = (pt.x == x) && (pt.y == y) && (pt.color == color)

  override def move(dx: Int, dy: Int): ColorPoint = new ColorPoint(x + dx, y + dy, color)

  /**
    * Below is example of overloading with covariant return
    *
    * @param dx x co-ordinate for the overloaded method
    * @return object of ColorPoint
    */
  def move(dx: Int): ColorPoint = new ColorPoint(x + dx, y, color)
}
