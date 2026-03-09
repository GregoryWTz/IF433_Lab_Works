package oop_109438_Gregorius.Week6.TugasMandiri1

fun main() {
    val lamp    = SmartLamp(id = "SL-001", name = "Ruang Tamu")
    val speaker = SmartSpeaker(id = "SS-001", name = "Google Nest Dapur")
    val cctv    = SmartCCTV(id = "CC-001", name = "Ezviz Garasi")

    val hub = SmartHomeHub()
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)
}