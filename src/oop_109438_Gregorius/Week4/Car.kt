package oop_109438_Gregorius.Week4

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobile $brand dengan $numberOfDoors pintu dibuka.")
    }
}