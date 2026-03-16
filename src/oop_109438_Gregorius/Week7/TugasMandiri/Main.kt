package oop_109438_Gregorius.Week7.TugasMandiri

fun main() {
    // Step 7 - Singleton
    GameManager.startGame()
    GameManager.startGame()

    // Step 8 - Factory & Enum
    println("\n--- Simulasi Factory & Enum ---")

    // Cetak drop chance LEGENDARY
    println("Drop Chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")

    // Buat senjata awal via Factory
    val starterSword = Weapon.forgeStarterSword()
    println("Senjata Awal: ${starterSword.item.name} | Damage: ${starterSword.item.damage} | Rarity: ${starterSword.item.rarity} | Durability: ${starterSword.durability}")

    println("\n--- Simulasi Blacksmith & Event ---")

    // copy() untuk upgrade damage, objek lama tetap tidak berubah
    val upgradedItem = starterSword.item.copy(damage = 25)
    println("Senjata Diupgrade: ${upgradedItem.name} | Damage: ${upgradedItem.damage} | Rarity: ${upgradedItem.rarity}")
    println("Senjata Lama (tidak berubah): ${starterSword.item.name} | Damage: ${starterSword.item.damage}") // Bukti immutable

    // Simulasi event berurutan
    println("\n--- Simulasi Battle Events ---")
    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}