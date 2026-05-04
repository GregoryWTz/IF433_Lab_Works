package oop_109438_Gregorius.Week11.TugasMandiri1

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    homeDevices.also { list ->
        list.add (
            SmartDevice("", "", false, 0).apply {
                name = "Philips WiZ Living Room"
                category = "Lighting"
                isOnline = true
                powerLoad = 12
            }
        )
    }

    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        println("(LOG) Kmarea terhubung")
        homeDevices.add(it)
    }
}