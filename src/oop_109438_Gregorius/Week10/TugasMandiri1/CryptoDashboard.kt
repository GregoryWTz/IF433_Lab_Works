package oop_109438_Gregorius.Week10.TugasMandiri1

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin( "BTC", 65000.0))
    coinRepo.add(Coin( "ETH", 3500.0))
    coinRepo.add(Coin( "SOL", 140.0))

    val response = ApiResponse("200 OK", coinRepo.getAllItems())
    response.data.forEach { coin ->
        println("${coin.name}")
        println("Price  : Rp${"%,.0f".format(coin.balance)}")
        println()
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction( "BTC", 6000.0))
    txRepo.add(Transaction( "ETH", 6000.0))
    txRepo.add(Transaction( "SOL", 6000.0))
}