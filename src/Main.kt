import abstracts.ATemplate
import abstracts.BaseTemplate
import animals.cats.CatA
import animals.superMethod1
import interfaces.A
import interfaces.B
import interfaces.MyInterface

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

    // ==== lesson 2/3 ====

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

    // ==== lesson 5 ====

    val st: String? = getString()

    val size = st!!.length

    println(size)

    // ==== lesson 6 ====

    val person = Person("Alex", "Barchuk", 24)

    val car = Car(20.5F, 10)

    println(car.isNew)

    println(person)

    // ==== lesson 7 ====

    val catA = CatA()
    catA.a1()

    superMethod1()

    // ==== lesson 8 ====

    var message : Color = Color.GREEN;
    var message2 : String = Color.RED.name

    println(Color.GREEN)
    println(Color.RED.name)
    println(Color.BLACK.colorHex)
    println(Color.RED.opacity)

    Color.BLACK.some()

    // ==== lesson 9 ====

    var N = 1

    var result = when (N) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        6 -> "Six"
        else -> "None"
    }

    println(result)

    var color : Color = Color.GREEN

    var result2 = when (color) {

        Color.WHITE -> "White"
        Color.BLACK -> "Black"
        Color.RED -> "Red"
        Color.GREEN -> "Green"
    }

    println(result2)

    when (setOf(Color.WHITE, Color.BLACK)) {
        setOf(Color.WHITE, Color.BLACK) -> "White-Black"
        setOf(Color.RED, Color.GREEN) -> "Red-Green"
    }

    var aa = 2
    var bb = 4

    when {
        (1 > 2) || (2 > 5) -> println("1 > 2 = true")
        (aa > bb) -> println("$aa > $bb = true")
        (aa == bb) -> println("$aa == $bb = true")
        (aa < bb) -> println("$aa < $bb = true")
        else -> println("else")
    }

    // ==== lesson 10 ====

    var v1: MyInterface = A()
    var v2: MyInterface = B()

    v1.fun1()
    v2.fun1()

    // ==== lesson 11 ====

    var v3 : BaseTemplate = ATemplate()

    v3.a()
    v3.minus()
    v3.a()
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

fun getFavoriteColor(color: Color) = when (color) {
    Color.WHITE, Color.BLACK -> "White-Black"
    Color.RED -> "Red"
    Color.GREEN -> "Green"
}