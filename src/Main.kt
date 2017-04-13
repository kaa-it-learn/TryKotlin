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
}
