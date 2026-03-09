package oop_109438_Gregorius.Week6.TugasMandiri1

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("$name (ID: $id) is now ON. The light is shining bright!")
    }

    override fun turnOff() {
        println("$name (ID: $id) is now OFF. The light has been turned off.")
    }
}