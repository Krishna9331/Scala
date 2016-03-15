/**
  * Created by mishrk3 on 3/15/2016.
  */
class PartialFunctionAndCase {

  /**
    * A PartialFunction is a function which accept some value not all of a certain type and return another value.
    * So A partial function defined as (Int) => String might not accept all the Integer.
    * Case is subclass of function Partial Function.
    *
    * We use isDefinedAt to confirm if a particular value is accepted by the partial function or not.
    *
    * PartialFunction is unrelated to a partially applied function.
    *
    * shorthand for defining <PartialFunction>
    */
  val caseOne: PartialFunction[Int, String] = {
    case 1 => "One"
  }

  val caseTwo: PartialFunction[Int, String] = {
    case 2 => "Two"
  }

  val caseThree: PartialFunction[Int, String] = {
    case 3 => "Three"
  }

  val caseFour: PartialFunction[Int, String] = {
    case 4 => "Four"
  }

  val wildCard: PartialFunction[Int, String] = {
    case _ => "Something else"
  }

  /**
    * The PartialFunction can be composed using something other than compose or andThen.
    * The keyword is orElse, that reflects whether the PartialFunction is defined over the supplied argument.
    */

  val customCase = caseOne orElse caseTwo orElse caseThree orElse caseFour orElse wildCard

  /**
    * <PartialFunction> can be passed to any functions which takes functions as an input as it is nothing new a subclass
    * of <Function> itself. Using case it makes the life easier many times.
    * Below two example explains it.
    */

  val extensions = Map("steve" -> 100, "bob" -> 101, "joe" -> 201, "Krishna" -> 4585)

  /**
    * Defining a filter without using partial function.
    * we have to access the index of the tuple for applying condition.
    */

  val withoutPartialFilter = extensions.filter((namePhone: (String, Int)) => namePhone._2 < 200)

  /**
    * Defining a filter using partial function, it is more expressive as in place of index we are using namespace.
    */

  val withPartialFilter = extensions.filter({ case (name, extension) => extension < 200 })
}
