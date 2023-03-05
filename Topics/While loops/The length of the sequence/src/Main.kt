fun main() {
    val sequence: MutableList<Int> = mutableListOf()

    while (true){
        val num: Int = readln().toInt()
        if (num <= 0) {
            break
        }
        sequence.add(num)
    }

    println(sequence.size)
}