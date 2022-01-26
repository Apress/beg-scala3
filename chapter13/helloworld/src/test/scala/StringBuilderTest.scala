import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest._

class StringBuilderTests extends AnyFlatSpec with BeforeAndAfter {
  
  val builder = StringBuilder()

  before {
    builder.append("Scala 3")
  }

  it should "append to the default string" in {
    builder.append(" introduce a lot of features")
    assert(builder.toString === "Scala 3 introduce a lot of features")
  }
}