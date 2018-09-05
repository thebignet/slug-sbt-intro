import org.scalatest._

class SlugSpec extends FunSuite with DiagrammedAssertions {
  test("Slug should start with S"){
    assert("Slug".startsWith("S"))
  }
  test("Slug should end with g"){
    assert("Slug".endsWith("g"))
  }
}