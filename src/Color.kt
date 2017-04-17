/**
 * Created by akruglov on 17.04.17.
 */
enum class Color(val colorHex : String, val opacity: Double = 1.0) {
    WHITE("#FFFFFFFF"),
    BLACK("FF000000"),
    RED("FFFF0000", 0.5),
    GREEN("FF00FF00");

    fun some() {
        println("some logic")
    }
}