def readLines(in:java.io.BufferedReader, acc:List[String]): List[String] =
  in.readLine match
    case null => acc
    case s => readLines(in,s :: acc)

def read3(in: java.io.BufferedReader): List[String] =
  readLines(in,Nil).reverse