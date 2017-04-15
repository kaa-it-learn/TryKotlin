/**
 * Created by akruglov on 15.04.17.
 */
class Car(private var weight: Float, private var size: Int) {

    var isNew: Boolean = false
        get() {
            return weight > size
        }
        set(value) {
            if (value) {
                println("yes")
            }
            field = value
        }
}