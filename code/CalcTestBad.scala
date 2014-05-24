import org.scalacheck.{Prop, Properties}
import org.scalacheck.Prop._
class Calc {
	def add(x: Int, y: Int) = x + y
}
object CalcTest extends Properties("Calc") {
  property("add returns number greater than given elements") = forAll { 
	(a: Int, b: Int) => 
		val result = new Calc().add(a,b)
		result >= a && result >= b 
  }
}
