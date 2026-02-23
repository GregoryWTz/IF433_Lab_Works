package oop_109438_Gregorius.Week4.TugasMandiri1

import oop_109438_Gregorius.Week4.Car

open class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int) : Car(brand, numberOfDoors) {

    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }
}