package hello.services

import hello.classen.SuggestionEntity
import hello.reposotorys.SuggestionRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SuggestionService @Autowired constructor(private val suggestionRepository: SuggestionRepository) {

    fun getAllSuggestions(): List<SuggestionEntity> {
        return suggestionRepository.findAll()
    }

    fun getSuggestionById(suggestionId: Int): SuggestionEntity? {
        return suggestionRepository.findById(suggestionId).orElse(null)
    }

    fun saveSuggestion(suggestion: SuggestionEntity): SuggestionEntity {
        return suggestionRepository.save(suggestion)
    }

    fun deleteSuggestion(suggestionId: Int) {
        suggestionRepository.deleteById(suggestionId)
    }
}
