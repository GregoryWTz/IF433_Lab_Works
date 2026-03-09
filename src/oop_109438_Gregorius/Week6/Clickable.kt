package oop_109438_Gregorius.Week6

interface Clickable {
    // ERROR: Property in an interface cannot have a backing field
    val name: String = "Tombol Rahasia"

    // function without body (Implicity Abstract)
    fun click()
}