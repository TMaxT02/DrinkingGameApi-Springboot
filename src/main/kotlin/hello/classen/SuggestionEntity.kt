package hello.classen

import jakarta.persistence.*

@Entity
@Table(name = "suggestions")
class SuggestionEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "suggestion_suggestionId")
    var suggestionId: Int =0,

    @Column(name = "suggestions_userId")
    var userId:Int= 0,

    @Column(name = "suggestion_suggestion")
    var suggestion: String ="",
) {
}