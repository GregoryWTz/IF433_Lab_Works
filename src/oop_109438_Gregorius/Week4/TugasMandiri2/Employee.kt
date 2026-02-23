package oop_109438_Gregorius.Week4.TugasMandiri2

open class Employee(val name: String, val baseSalary: Int) {
    open fun work() {
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Int {
        return (baseSalary * 10) / 100
    }
}