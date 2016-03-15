/**
  * Created by mishrk3 on 3/15/2016.
  */
class FunctionalComposition {

  /**
    * Compose operation combines the two or more function and creates a single function by arranging them into an order.
    * so f(x) and g(x) after composition will create f(g(x));
    *
    * or
    *
    * if f(y) = z
    * and g(x) = y. If we have given x and we want to calculate z we can apply compose over f(y) and g(x).
    */

  def f(text: String) = "My Name is: " + text

  def g(name: String) = name

  /**
    * The signature of below function will be:
    * (String) => java.lang.String = <function>
    */
  val composedFunction = f _ compose g _

  /**
    * andThen also combine the function as compose do, however it order functions in reverse of compose operation.
    *
    * so f(x) and g(x) will become g(f(x)) after applying andThen operation
    */

  val valAndThen = f _ andThen g _
}
