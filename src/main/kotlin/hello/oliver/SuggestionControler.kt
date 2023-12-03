package hello.oliver

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/suggestion")
class SuggestionControler {

    @GetMapping("/getSuggestion")
    fun getSuggestion(): MutableList<String>{

        return SuggestionLogic().getSuggestion()
    }
}