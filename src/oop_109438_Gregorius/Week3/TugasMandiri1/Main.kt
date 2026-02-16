package oop_109438_Gregorius.Week3.TugasMandiri1

fun main() {
    val w = Weapon("mjolnir")

    w.damage = -50
    w.damage = 9999

    println("Senjata: ${w.name}")
    println("Damage Akhir: ${w.damage}")
    println("Tier: ${w.tier}")
}