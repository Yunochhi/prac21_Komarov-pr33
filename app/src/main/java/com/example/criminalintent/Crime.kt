import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.UUID

class Crime(var id: UUID = UUID.randomUUID()) {
    var title: String = ""
    var date: Date = getSpanishDate()
    var isSolved: Boolean = false

    constructor(id: UUID, title: String, date: Date, isSolved: Boolean) : this(id) {
        this.title = title
        this.date = date
        this.id = id
        this.isSolved = isSolved
    }

    private fun getSpanishDate(): Date {
        val spain = SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale("es", "ES"))
        return spain.parse(spain.format(Date()))!!
    }
}
