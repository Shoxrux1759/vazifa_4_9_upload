package Models

data class Byline(
    val organization: Any,
    val original: String,
    val person: List<Person>
)