package oop_109438_Gregorius.Week1

fun main() {
    val gameTitle: String = "God Of War"
    val price: Int = 700000
    val newPrice = calculateDiscount(price)
}

fun calculateDiscount(price: Int) = if (price > 500000) price * 0.8 else price * 0.9