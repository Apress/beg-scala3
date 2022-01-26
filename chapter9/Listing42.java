import java.util.Optional;
import scala.jdk.javaapi.OptionConverters;

public class JBook {
    public Option<Integer> calculatePrice() {
        return OptionConverters.toScala(Optional.empty());
    }

    public Option<String> getName() {
        return OptionConverters.toScala(Optional.of("IT"));
    }
}