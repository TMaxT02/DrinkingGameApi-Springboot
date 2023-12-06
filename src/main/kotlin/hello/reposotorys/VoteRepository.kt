package hello.reposotorys

import hello.classen.voteEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface VoteRepository : JpaRepository<voteEntity, Int> {
}