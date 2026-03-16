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
}