import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val a: Double = readln().toDouble()
    val b: Double = readln().toDouble()
    val c: Double = readln().toDouble()

    val determinant: Double = b.pow(2) - 4 * a * c

    val root1: Double = (-b + sqrt(determinant)) / (2.0 * a)
    val root2: Double = (-b - sqrt(determinant)) / (2.0 * a)

    val roots = arrayOf(root1, root2).sortedArray()

    println("${roots[0]} ${roots[1]}")
}