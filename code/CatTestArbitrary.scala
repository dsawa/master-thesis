import org.scalacheck.{Gen, Arbitrary, Prop, Properties}
import org.scalacheck.Prop._
class Cat(val name: String)
object CatTest extends Properties("Cat") {
  property("length and size methods on string returns same value") = {
	implicit val album: Arbitrary[Cat] = Arbitrary {
	  for { a <- Gen.alphaStr } yield (new Cat(a))
	}
	forAll { cat: Cat => cat.name.size == cat.name.length }
  }
}
