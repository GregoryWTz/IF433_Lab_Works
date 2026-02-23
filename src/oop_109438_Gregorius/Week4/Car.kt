package oop_109438_Gregorius.Week4

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobile $brand dengan $numberOfDoors pintu dibuka.")
    }

    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }

    override fun accelerate() {
        super.accelerate() // Memanggil logika penambahan kecepatan milik Parent
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan.")
    }
}