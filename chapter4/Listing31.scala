def allStrings(expr: => String): List[String] = expr match {
  case null => Nil
  case s => s :: allStrings(expr)
}

import java.io._
import java.io._
val br = new BufferedReader(new FileReader("foo.txt"))
allStrings(br.readLine)