import kotlin.math.cos
import kotlin.math.sin

fun main() {
    val rad = readln().toDouble()
    val sin = sin(rad)
    val cos = cos(rad)
    val diff = sin - cos
    println(diff)
}
