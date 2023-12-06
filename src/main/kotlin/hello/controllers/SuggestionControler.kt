package hello.controllers

import hello.classen.SuggestionEntity
import hello.logic.TaskService
import hello.logic.VoteService
import hello.services.SuggestionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/suggestion")
class SuggestionControler @Autowired constructor(
    private val suggestionService: SuggestionService,
    private val taskService: TaskService,
    private val voteService: VoteService
) {


    @GetMapping("/getSuggestionById")
    fun getSuggestionById(@PathVariable id: Int): ResponseEntity<SuggestionEntity> {
        return ResponseEntity(suggestionService.getSuggestionById(id), HttpStatus.OK)
    }

    @GetMapping("/getAllSuggestions")
    fun getAllSuggestions():
            ResponseEntity<List<SuggestionEntity>>{
        return ResponseEntity(suggestionService.getAllSuggestions(), HttpStatus.OK)
    }

    @GetMapping("/saveSuggestion()")
    fun creatSuggestion(@PathVariable suggestion: String) {
        return
        // return ResponseEntity(suggestionService.saveSuggestion(), HttpStatus.OK)
    }
}