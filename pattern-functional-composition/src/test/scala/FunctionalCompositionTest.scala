import org.specs2.mutable.Specification

/**
  * Created by mishrk3 on 3/15/2016.
  */
class FunctionalCompositionTest extends Specification {

  "compose operation" should {
    val composer = new FunctionalComposition
    "order function and combine them" in {
      val result = composer.composedFunction("Krishna")
      result mustEqual "My Name is: Krishna"
    }
  }

  "andThen operation" should {
    val composer = new FunctionalComposition
    "order function and combine them" in {
      val result = composer.valAndThen("Krishna")
      result mustEqual "My Name is: Krishna"
    }
  }

}
