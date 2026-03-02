package oop_109438_Gregorius.Week5.TugasMandiri2

class EWallet (accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance > amount) {
            balance -= amount
            print("Sukses, sisa saldo: $balance\n")
        } else {
            print("Saldo tidak cukup!\n")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        print("Sukses topUp: $amount\n")
    }
}