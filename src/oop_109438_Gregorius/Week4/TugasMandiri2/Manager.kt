package oop_109438_Gregorius.Week4.TugasMandiri2

open class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {
    override fun work() {
        super.work()
        println("$name sedang memimpin rapat divisi.")
    }

    override fun calculateBonus() {
        return super.calculateBonus() + 500000
    }
}