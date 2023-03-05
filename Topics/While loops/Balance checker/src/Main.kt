import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    var transactionComplete = true
    while (scanner.hasNextInt()) {
        val purchase = scanner.nextInt()
        if (balance < purchase) {
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $purchase.")
            transactionComplete = false
            break
        }
        balance -= purchase
    }
    if (transactionComplete) {
        println("Thank you for choosing us to manage your account! Your balance is $balance.")
    }
}