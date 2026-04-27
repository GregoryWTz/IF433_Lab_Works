package oop_109438_Gregorius.Week10.TugasMandiri1

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin( "BTC", 65000.0))
    coinRepo.add(Coin( "ETH", 3500.0))
    coinRepo.add(Coin( "SOL", 140.0))
}