scala> import scala.jdk.javaapi.CollectionConverters
scala> import java.util.List
scala> import java.util.ArrayList
scala> val javaObject = java.util.ArrayList(java.util.List.of(1,2,3))
scala> val scalaObject = CollectionConverters.asScala(javaObject)
val scalaObject: scala.collection.mutable.Buffer[Int] = Buffer(1, 2, 3)