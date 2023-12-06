package hello

import hello.classen.SuggestionEntity
import hello.services.SuggestionService
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mockito.`when`
import org.mockito.Mockito.any
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.http.MediaType
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultHandlers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SuggestionTest(
	@Autowired private val suggestionService: SuggestionService,
	@Autowired private val context: WebApplicationContext,
) {
	private lateinit var mockMvc: MockMvc

	@BeforeEach
	fun setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build()
	}
	@Test
	fun findAll() {
		val url: String = "/suggestion/getAllSuggestions"
		val suggestion = SuggestionEntity(1, 123, "Test suggestion")
		suggestionService.saveSuggestion(suggestion)

		mockMvc.perform(get(url))
			.andExpect(status().isOk)
			.andExpect(content().contentType(MediaType.APPLICATION_JSON))
			.andExpect(jsonPath("[0].suggestionId").value(1))
			.andExpect(jsonPath("[0].userId").value(123))
			.andExpect(jsonPath("[0].suggestion").value("Test suggestion"))
			.andDo(MockMvcResultHandlers.print())
	}
}