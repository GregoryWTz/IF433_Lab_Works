package oop_109438_Gregorius.Week5.TugasMandiri2

fun main() {
    val eWallet = EWallet("Donovan", 50000.0)
    val creditCard = CreditCard("Snoopy", 100000.0)

    val paymentList: List<PaymentMethod> = listOf(eWallet, creditCard)

    for (payment in paymentList) {
        payment.processPayment(75000.0)
    }
}