package hello

import org.hibernate.type.TrueFalseConverter
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController() {


	@GetMapping("/test/function")
	fun getfunktion() = "Oliver"
}