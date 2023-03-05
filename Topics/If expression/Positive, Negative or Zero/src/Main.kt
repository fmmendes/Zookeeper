fun main() {
    val num: Int = readln().toInt()
    println(if (num < 0) "negative" else if (num > 0) "positive" else "zero")
}