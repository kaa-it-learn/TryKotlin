/**
 * Created by akruglov on 15.04.17.
 */
open class Person(var firstName: String, var lastName: String = "to", var age: Int = 6) {

    open val fax: Int = 2

    open fun getAddress(): String {
        return "test"
    }

    override fun toString(): String {
        return "Person(firstName='$firstName', lastName='$lastName', age=$age)"
    }
}
