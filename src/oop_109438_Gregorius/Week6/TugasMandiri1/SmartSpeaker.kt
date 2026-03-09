package oop_109438_Gregorius.Week6.TugasMandiri1

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("$name (ID: $id) is now ON. Ready to play music!")
    }

    override fun turnOff() {
        println("$name (ID: $id) is now OFF. Music stopped.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}