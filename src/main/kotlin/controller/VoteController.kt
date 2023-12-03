package controller

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/trinkspiel/vote")
class VoteController() {

    @PostMapping("/creatVote")
    fun creatVote(
        @RequestParam player: String,
        @RequestParam voteFor: String,
        @RequestParam howvote: String
    ): String {
        return "Vote registered for $player. Voted for: $voteFor"
    }

    @GetMapping("/getVote")
    fun getVotes(): Map<String, Int> {
        return mutableMapOf<String, Int>()
    }
}