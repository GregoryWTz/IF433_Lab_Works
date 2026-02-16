package oop_109438_Gregorius.Week3.TugasMandiri2

fun main() {
    val user = player("Donovan")

    println("Adding 50 XP")

    user.addXp(50)
    println("Level saat ini: ${user.level}")

    println("-----------------------------")

    user.addXp(60)
    println("Level saat ini: ${user.level}")
}