fun main() {
    val n: Int = readln().toInt()

    var a: Int = 0
    var b: Int = 0
    var c: Int = 0
    var d: Int = 0

    repeat(n) {
        val grade: Int = readln().toInt()
        if (grade == 5) a++
        if (grade == 4) b++
        if (grade == 3) c++
        if (grade == 2) d++
    }

    println("$d $c $b $a")
}