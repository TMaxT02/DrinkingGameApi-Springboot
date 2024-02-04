package hello

import com.fasterxml.jackson.databind.ObjectMapper
import hello.classen.SuggestionEntity
import hello.services.SuggestionService
import org.junit.jupiter.api.Assertions.assertEquals
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

    @Autowired
    private lateinit var objectMapper: ObjectMapper

    @BeforeEach
    fun setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build()
        val suggestion = SuggestionEntity(1, 1, "Test suggestion1")
        val suggestion2 = SuggestionEntity(2, 2, "Test suggestion2")
        suggestionService.saveSuggestion(suggestion)
        suggestionService.saveSuggestion(suggestion2)
    }

    @Test
    fun findAll() {
        val url: String = "/suggestion/getAllSuggestions"


        mockMvc.perform(get(url))
            .andExpect(status().isOk)
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("[0].suggestionId").value(1))
            .andExpect(jsonPath("[0].userId").value(1))
            .andExpect(jsonPath("[0].suggestion").value("Test suggestion1"))
            .andDo(MockMvcResultHandlers.print())
    }

    @Test
    fun getOneById() {
        val url: String = "/suggestion/getSuggestionById/2"
        mockMvc.perform(get(url))
            .andDo(MockMvcResultHandlers.print())
            .andExpect(status().isOk)
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath(".suggestionId").value(2))
            .andExpect(jsonPath(".userId").value(2))
            .andExpect(jsonPath(".suggestion").value("Test suggestion2"))

    }

    @Test
    fun saveSuggestion() {
        //Speichert ein Enity
        val urlSave: String = "/suggestion/creatSuggestion/mehrbier"
        mockMvc.perform(get(urlSave))


        //Holt das Entity
        val url: String = "/suggestion/getSuggestionById/3"
        val json = mockMvc.perform(get(url))
            .andDo(MockMvcResultHandlers.print())
            .andExpect(status().isOk)
            .andReturn().response.contentAsString

        //vergleicht
        assertEquals(json, 3)
    }
}