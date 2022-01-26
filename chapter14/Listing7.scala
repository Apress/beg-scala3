def read2(in: java.io.BufferedReader): List[String] =
  val ret: List[String] = Nil
  doRead(in, ret)

def doRead(in: java.io.BufferedReader, acc: List[String]):List[String] =
  in.readLine match
    case null => acc
    case s => doRead(in, s :: acc)
  doRead(in, Nil).reverse