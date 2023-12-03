package KlassenDieWirInDieDbSchieben
import javax.persistence.*
@Entity
@Table(name = "suggestions")
data class SuggestionEnity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    val id: Long = 0,

    @Column(name = "suggested_by")
    val suggestedBy: String,

    @Column(name = "suggestion_text")
    val suggestionText: String
)