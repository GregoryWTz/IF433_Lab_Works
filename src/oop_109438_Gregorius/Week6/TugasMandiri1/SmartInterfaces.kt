package oop_109438_Gregorius.Week6.TugasMandiri1

interface SmartDevice {
    val id: String
    val name: String
}

interface Switchable {
    fun turnOn()
    fun turnOff()
}

interface Recordable {
    fun startRecord()
    fun stopRecord()
}