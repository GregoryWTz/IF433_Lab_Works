package oop_109438_Gregorius.Week11.TugasMandiri1

data class SmartDevice(var name: String, var category: String, var isOnline: Boolean = false, var powerLoad: Int = 0)

fun SmartDevice.diagnose(): String {
    return "[DIAGNOSTIK] $name | Kategori: $category | Status: ${if (isOnline) "Online" else "Offline"} | Data: $powerLoad Watt."
}