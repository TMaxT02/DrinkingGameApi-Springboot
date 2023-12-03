package hello.oliver.classen

import jakarta.persistence.*

@Entity
@Table(name = "suggestions")
class SuggestionEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "suggestion_suggestionId")
    var suggestionId: Long,

    @Column(name = "suggestions_userId")
    var userId:Long,

    @Column(name = "suggestion_suggestion")
    var suggestion: String,
) {
}