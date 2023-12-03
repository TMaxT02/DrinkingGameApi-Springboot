package KlassenDieWirInDieDbSchieben

import javax.persistence.*

@Entity
@Table(name = "votes")
data class VoteEnity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    val id: Long = 0,

    @Column(name = "voter_id")
    val voterId: String,

    @Column(name = "voted_for")
    val votedFor: String,

    @Column(name = "vote_type")
    val voteType: String
)