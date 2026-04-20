package oop_109438_Gregorius.Week9.TugasMandiri1

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),   // Profit
        TradeLog("BTCUSDT", "SHORT", 10, -5.2, "CLOSED"),  // Loss
        TradeLog("ETHUSDT", "LONG", 50, 42.0, "OPEN"),     // Profit & Open
        TradeLog("ETHUSDT", "SHORT", 25, -12.8, "CLOSED"), // Loss
        TradeLog("SOLUSDT", "LONG", 10, -2.5, "OPEN"),     // Loss & Open
        TradeLog("SOLUSDT", "LONG", 20, 8.7, "CLOSED")     // Profit
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

    val winningTrades = closedTrades.filter { it.roe > 0.0 }

    val losingTrades = closedTrades.filter { it.roe <= 0.0 }

    val topPerformerString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val worstPerformersString = losingTrades
        .sortedByDescending { it.roe }
        .map {"LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")
    tradeHistory.forEach { row ->
        println(row)
    }

    worstPerformersString.forEach { row ->
        println(row)
    }

    println("Unique Pairs: $uniquePairs")
    // Done
}