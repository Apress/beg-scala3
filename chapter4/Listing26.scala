import scala.util.{Try, Success, Failure}
def transformToInt(number: String): Try[Int] = Try(Integer.parseInt(number))

transformToInt("1")
transformToInt("s")