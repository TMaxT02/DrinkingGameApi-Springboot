package hello.logic

import hello.classen.voteEntity
import hello.reposotorys.VoteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class VoteService @Autowired constructor(private val voteRepository: VoteRepository) {

    fun getAllVotes(): List<voteEntity> {
        return voteRepository.findAll()
    }

    fun getVoteById(voteId: Int): voteEntity? {
        return voteRepository.findById(voteId).orElse(null)
    }

    fun saveVote(vote: voteEntity): voteEntity {
        return voteRepository.save(vote)
    }

    fun deleteVote(voteId: Int) {
        voteRepository.deleteById(voteId)
    }
}
