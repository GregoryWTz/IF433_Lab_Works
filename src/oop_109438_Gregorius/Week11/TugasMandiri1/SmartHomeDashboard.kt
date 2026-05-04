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

    val AcInventer = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(AcInventer)

    homeDevices.add(
        SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10)
    )

    val searchResult = homeDevices.find {
        it.category == "Camera"
    }?.let { device ->
        println("${device.diagnose()}")
    }
}