package oop_109438_Gregorius.Week6.TugasMandiri1

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable  {

    override fun turnOn() {
        println("$name (ID: $id) is now ON. Initializing camera...")
        startRecord()
    }

    override fun turnOff() {
        stopRecord()
        println("$name (ID: $id) is now OFF. Camera shutting down.")
    }

    override fun startRecord() {
        println("$name (ID: $id) has started recording. Monitoring in progress...")
    }

    override fun stopRecord() {
        println("$name (ID: $id) has stopped recording. Footage saved.")
    }
}