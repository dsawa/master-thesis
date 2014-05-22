import org.scalatest.WordSpec
class SetSpec extends WordSpec {
  "A Set" when {
    "empty" should {
      "have size 0" in {
        assert(Set.empty.size == 0)
      }
    }
  }
}
