package hello

import hello.classen.SuggestionEntity
import hello.services.SuggestionService
import jakarta.annotation.PostConstruct
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class Application(private val suggestionService: SuggestionService) {

	private val log = LoggerFactory.getLogger(Application::class.java)

	@PostConstruct
	fun init() {
		val createdSuggestion = suggestionService.saveSuggestion(SuggestionEntity(1,1,"Mehr Bier Trinken"))
		log.info("Created suggestion with ID: ${createdSuggestion.suggestionId}")
	}

}
fun main() {
	runApplication<Application>()
}