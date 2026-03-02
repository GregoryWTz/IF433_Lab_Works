package oop_109438_Gregorius.Week5.TugasMandiri2

class CreditCard(accountName: String, val limit: Double, var usedAmount: Double = 0.0) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (usedAmount + amount < limit) {
            usedAmount += amount
            print("Sukses!")
        } else {
            print("Transaksi ditolak!")
        }
    }
}