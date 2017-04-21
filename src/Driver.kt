/**
 * Created by akruglov on 21.04.17.
 */
class Driver(val name : String) : Person(name) {

    override val fax: Int = 2

    override fun getAddress(): String {
        return "test2"
    }

    override fun toString(): String {
        return "Driver(fax=$fax, name=$name)"
    }
}