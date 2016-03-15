import org.specs2.mutable.Specification

/**
  * Created by mishrk3 on 3/15/2016.
  */
class PartialFunctionAndCaseTest extends Specification {

  "partial function" should {
    val pfCase = new PartialFunctionAndCase
    "return true for defined argument" in {
      pfCase.caseOne(1) mustEqual "One"
    }
    "composed together using orElse" in {
      pfCase.customCase(1) mustEqual "One"
      pfCase.customCase(2) mustEqual "Two"
      pfCase.customCase(3) mustEqual "Three"
      pfCase.customCase(4) mustEqual "Four"
      pfCase.customCase(9) mustEqual "Something else"
      pfCase.customCase(1000) mustEqual "Something else"
    }
    "can be passed as normal function" in{
      pfCase.withoutPartialFilter mustEqual pfCase.withPartialFilter
    }
  }
}
