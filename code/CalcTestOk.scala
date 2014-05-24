import org.scalacheck.{Gen, Prop, Properties}
import org.scalacheck.Prop._
object CalcTest extends Properties("Calc") {
  property("add returns number greater than given elements") = 
	forAll(Gen.choose(0,1000), Gen.choose(0,1000)) { 
		(a: Int, b: Int) =>
			val result = new Calc().add(a,b)
			result >= a && result >= b
  }
}
