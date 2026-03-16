package oop_109438_Gregorius.Week7.TugasMandiri

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            val (monsterName) = event  // Destructure
            println("⚔️  ENCOUNTER! Seekor '$monsterName' muncul!")
        }
        is BattleState.LootDropped -> {
            val (item) = event  // Destructure
            println("🎁  LOOT! Kamu mendapatkan '${item.name}' | Damage: ${item.damage} | Rarity: ${item.rarity}")
        }
        is BattleState.GameOver -> {
            val (reason) = event  // Destructure
            println("💀  GAME OVER! Alasan: $reason")
        }
        BattleState.SafeZone -> {
            println("🛡️  SAFE ZONE. Kamu berada di zona aman. Tidak ada ancaman.")
        }
    }
}