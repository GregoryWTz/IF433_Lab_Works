package oop_109438_Gregorius.Week5.TugasMandiri2

class EWallet (accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance > amount) {
            balance -= amount
            print("Sukses: $balance")
        } else {
            print("Saldo tidak cukup!")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
    }
}