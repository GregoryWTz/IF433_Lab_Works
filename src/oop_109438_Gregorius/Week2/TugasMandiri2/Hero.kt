package oop_109438_Gregorius.Week2.TugasMandiri2

class hero(
    val name: String,
    var baseDamage: Int,
    var hp: Int = 100,
) {
    fun attack(targetName: String) {
        println("$name menebas $targetName dengan kekuatan $baseDamage!")
    }

    fun takeDamage(damage: Int) {
        this.hp -= damage

        if (this.hp < 0) {
            this.hp = 0
        }
    }

    fun isAlive() : Boolean {
        return this.hp > 0
    }
}