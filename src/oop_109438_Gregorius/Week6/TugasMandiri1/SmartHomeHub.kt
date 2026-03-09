package oop_109438_Gregorius.Week6.TugasMandiri1

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Device '${device.name}' (ID: ${device.id}) added to SmartHomeHub.")
    }

    fun turnOffAllSwitches() {
        println("\n--- Turning off all switchable devices ---")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
        println("-----------------------------------------")
    }
}