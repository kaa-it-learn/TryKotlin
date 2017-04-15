/**
 * Created by kruglovs on 13.04.17.
 */

fun main(args: Array<String>) {
    val name: String = "Alex"
    val a: Int = 1
    val b: Int = 2

    println("Hello $name! It's my first program")
    println("A + B = ${a + b}")

    val userJava = UserJava("alex@devcolibri.com")
    println("Java example: ${userJava.email}")

    val userKotlin = UserKotlin("test@devcolibri.com")
    println("Kotlin example: ${userKotlin.email}")

    var a1: String = "123"

    var a6: Byte = 8      // 8
    var a0: Short = 11    // 16
    var a2: Int = 123     // 32
    var a3: Long = 123    // 64

    var a4: Double = 0.1  // 64
    var a5: Float = 0.1F  // 32

    var b1: Long = a2.toLong()

    var c1: Char = 'f'
    var b2: Boolean = true

    val st: String? = getString()

    val size = st!!.length

    println(size)

    val person = Person("Alex", "Barchuk", 24)

    val car = Car(20.5F, 10)

    println(car.isNew)

    println(person)
}

fun myFirstFunction() : Int {
    return 1
}

fun myFirstFunction2(a: Long): Int {
    return a.toInt()
}

fun myFirstFunction3() {

}

fun myFirstFunction4(a: Long, b: Double) = a + b

fun getString() : String? {
    return "hello"
}