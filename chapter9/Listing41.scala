import java.util.Optional
import scala.jdk.javaapi.OptionConverters

val optionalPrice = Optional.of(1) //Optional(1)
val optionPrice = OptionConverters.toScala(optionalPrice) //Some(1)

val optionName = Some("Beginning Scala") //Some
val optionalName = OptionConverters.toJava(optionName)//Optional
