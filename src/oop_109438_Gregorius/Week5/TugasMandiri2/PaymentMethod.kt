package oop_109438_Gregorius.Week5.TugasMandiri2

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}