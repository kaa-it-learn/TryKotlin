package abstracts

/**
 * Created by akruglov on 17.04.17.
 */
abstract class BaseTemplate {

    var count = 0

    fun a() {
        count++
        println("COUNT: $count")
    }

    abstract fun minus()
}