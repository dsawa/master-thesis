import org.scalatest.{FunSpec, Matchers}
import org.scalatest.prop.GeneratorDrivenPropertyChecks
import org.scalacheck.Gen
class CalcTest extends FunSpec with Matchers 
  with GeneratorDrivenPropertyChecks {
  describe("Calc") {
    describe("when adding numbers") {
      it("should have result greater than added elements") {
        forAll(Gen.choose(0, 1000), Gen.choose(0, 1000)) { 
          (a: Int, b: Int) => 
		    new Calc().add(a,b) should (be >= a and (be >= b))
        }
      }
    }
  }
}
