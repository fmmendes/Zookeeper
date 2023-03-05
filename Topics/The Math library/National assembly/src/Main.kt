import kotlin.math.pow
import kotlin.math.roundToInt

const val CB: Double = 1.0 / 3.0

fun main() {
    val num: Double = readln().toDouble()
    val cbrt = num.pow(CB)

    println(cbrt.roundToInt())
}