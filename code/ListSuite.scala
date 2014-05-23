import org.scalatest.Matchers
import org.scalatest.junit._
import org.junit._
import org.junit.Assert._
class ListSuite extends JUnitSuite with Matchers {
  var list: List[Int] = _
  @Before def init() {
    list = List(1, 2, 5)
  }
  @Test def checkListSize() {
	list.size should be (3)
	assertEquals(3, list.size)
  }
}
