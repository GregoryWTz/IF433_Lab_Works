package oop_109438_Gregorius.Week11

// Extension function dengan reciever 'this'
fun String.addGreeting(): String {
    return "Hello $this"
}

fun String.repeatTimes(n : Int): String {
    return this.repeat(n)
}

fun String?.isNullEmptyCustom(): Boolean {
    return this == null || this.isEmpty()
}