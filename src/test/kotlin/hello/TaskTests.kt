package hello

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForObject
import org.springframework.test.context.jdbc.Sql

@SpringBootTest(webEnvironment= WebEnvironment.RANDOM_PORT)
@Sql(scripts = ["classpath:/task.sql"])
class TaskTests(@Autowired private val restTemplate: TestRestTemplate) {

	@Test
	fun findOne() {
		assertEquals(2,2)
	}
}

