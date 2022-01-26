import java.time.LocalDateTime
val actualDate = LocalDateTime.now()
import java.time.format.DateTimeFormatter
val formatter = DateTimeFormatter.ofPattern("dd/MM")
actualDate.format(formatter)