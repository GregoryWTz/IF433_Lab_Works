package oop_109438_Gregorius.Week1

fun main() {
    val gameTitle: String = "God Of War"
    val price: Int = 700000
    val newPrice = calculateDiscount(price)

    val userNote: String? = null

    printReceipt(
        gameTitle = gameTitle,
        price = price,
        newPrice = newPrice.toInt(),
        userNote = userNote
    )
}

fun calculateDiscount(price: Int) = if (price > 500000) price * 0.8 else price * 0.9

fun printReceipt(gameTitle: String, newPrice: Int, price: Int, userNote: String?) {
    println("Title: $gameTitle")
    println("Original Price: $price")
    println("New Discounted Price: $newPrice")

    println("Note: ${userNote ?: "Tidak ada catatan"}")
}