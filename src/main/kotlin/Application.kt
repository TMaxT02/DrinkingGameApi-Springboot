import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DrinkApplication

fun main(args: Array<String>) {
    runApplication<DrinkApplication>(*args)
}