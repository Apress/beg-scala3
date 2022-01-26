import scala.jdk.javaapi.CollectionConverters
import java.util.List
import java.util.ArrayList
val javaObject = java.util.ArrayList(java.util.List.of(1,2,3))
val scalaObject = CollectionConverters.asScala(javaObject)