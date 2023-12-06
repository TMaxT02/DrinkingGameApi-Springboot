package hello.reposotorys

import hello.classen.SuggestionEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SuggestionRepository : JpaRepository<SuggestionEntity, Int> {
}