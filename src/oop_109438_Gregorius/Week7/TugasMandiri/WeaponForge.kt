package oop_109438_Gregorius.Week7.TugasMandiri

class Weapon private constructor(val item: GameItem, val durability: Int) {

    companion object {

        fun forgeStarterSword(): Weapon {
            return Weapon(
                item = GameItem("Pedang Kayu Bapuk", damage = 5, rarity = ItemRarity.COMMON),
                durability = 50
            )
        }

        fun forgeEpicSword(): Weapon {
            return Weapon(
                item = GameItem("Pedang Pembasmi Kegelapan", damage = 150, rarity = ItemRarity.EPIC),
                durability = 300
            )
        }

    }
}