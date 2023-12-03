package controller

import org.springframework.web.bind.annotation.*
@RestController
@RequestMapping("/trinkspiel/vote")
class SuggestionController() {

    @PostMapping("/createVote")
    fun createSuggestion(
        @RequestParam player: String,
        @RequestParam suggestion: String,
    ): String {
        return "Suggestion erfolgreich erstellt für den Spieler: $player, Vorschlag: $suggestion"
    }

    @GetMapping("/getVote")
    fun getSuggestions(): List<String> {
        return listOf("sug1", "sug2")
    }
}