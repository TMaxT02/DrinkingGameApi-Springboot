package hello.oliver

class SuggestionLogic() {
    private val liste = mutableListOf<String>("vorschlag1", "vorschlag 2")
    fun createSuggestion(user: String="max", suggestion: String="das ist mein vorschlag") {

    }

    fun getSuggestion(): MutableList<String> {

        return liste
    }
}