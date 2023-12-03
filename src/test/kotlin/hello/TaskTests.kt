package hello

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForObject

@SpringBootTest(webEnvironment= WebEnvironment.RANDOM_PORT)
class TaskTests(@Autowired private val restTemplate: TestRestTemplate) {

	@Test
	fun findAll() {
		assertEquals("Max", restTemplate.getForObject<String>("/task/getTask"))
	}
}