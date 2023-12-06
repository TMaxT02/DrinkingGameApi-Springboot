package hello.classen

import jakarta.persistence.*

@Entity
@Table(name = "vote")

class voteEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vote_voteId")
    var voteId: Int,

    @Column(name = "vote_votedFor")
    var votedFor: String,

    @Column(name = "vote_userId")
    var userId: Int,

    @Column(name = "vote_voteHow")
    var voteHow: String


) {


}