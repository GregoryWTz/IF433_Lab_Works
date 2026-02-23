package oop_109438_Gregorius.Week4

import oop_109438_Gregorius.Week4.TugasMandiri1.ElectricCar

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
}