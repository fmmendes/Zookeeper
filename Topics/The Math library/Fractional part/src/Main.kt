const val ONE: Double = 1.0
const val TEN: Double = 10.0

fun main() {
    val num: Double = readln().toDouble()
    println((num % ONE * TEN).toInt())
}