package hello.oliver.classen

import jakarta.persistence.*

@Entity
@Table(name = "vote")

class voteEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "voteId")
    var voteId: Long,

    @Column(name = "votedFor")
    var votedFor: String,

    @Column(name = "voteHow")
    var voteHow: String


) {


}