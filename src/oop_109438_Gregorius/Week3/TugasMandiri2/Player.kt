package oop_109438_Gregorius.Week3.TugasMandiri2

class player(val username: String) {
    private var xp: Int = 0

    val level: Int
    get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount > 0) {
            val levelSebelumnya = level

            xp += amount
            println("$username mendapatkan $amount XP.")

            if (level > levelSebelumnya) {
                println("Level Up! Selamat $username naik ke level $level")
            }
        } else {
            println("XP yang ditambahkan harus positif!")
        }
    }
}