package interfaces

/**
 * Created by akruglov on 17.04.17.
 */
interface MyInterface {

    val prop1: Int
        get() = 2

    fun fun1()
    fun fun2() {
        println("default")
    }
}