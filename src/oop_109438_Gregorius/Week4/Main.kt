package oop_109438_Gregorius.Week4

import oop_109438_Gregorius.Week4.TugasMandiri1.ElectricCar
import oop_109438_Gregorius.Week4.TugasMandiri2.*

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val electricCar = ElectricCar("byd", 2, 92)
    electricCar.accelerate()
    electricCar.honk()
    electricCar.openTrunk()

    println("\n --- Manager ---")
    val manager = Manager("Donovan", 1000000)
    manager.work()
    println("Bonus Salary Manager ${manager.name} = ${manager.calculateBonus()}")

    println("\n--- Developer ---")
    val dev = Developer("Daniel", 500000, "Python")
    dev.work()
    println("Bonus Salary Developer ${dev.name} = ${dev.calculateBonus()}")
}