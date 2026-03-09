package oop_109438_Gregorius.Week6

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai Checkout...")
    method.pay(amount) // Dynamic Polymorphism in action
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)
}