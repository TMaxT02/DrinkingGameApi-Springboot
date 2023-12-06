package hello

import hello.classen.SuggestionEntity
import hello.reposotorys.SuggestionRepository
import hello.services.SuggestionService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForObject

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class SuggestionTest(@Autowired private val restTemplate: TestRestTemplate,
					 @Autowired private val suggestionService: SuggestionService,
) {

	@Test
	fun findAll() {
		val suggestion = SuggestionEntity(1, 123, "Test suggestion")
		suggestionService.saveSuggestion(suggestion)

		val result = restTemplate.getForObject("/api/suggestions/getAll", SuggestionEntity::class.java)

		assertEquals(mutableListOf(3), result)
	}
}