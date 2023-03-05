import kotlin.math.sqrt

fun main() {
    val a: Double = readln().toDouble()
    val b: Double = readln().toDouble()
    val c: Double = readln().toDouble()

    val p: Double = (a + b + c) / 2

    val s: Double = sqrt(p * (p - a) * (p - b) * (p - c))

    println(s)
}
