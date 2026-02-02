package oop_109438_Gregorius.Week1

fun main() {
    val name: String = "John Cena"
    val score: Int = 76

    println("Nama: $name Score: $score")

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

    println("Grade kamu: $grade")
    println("Status: ${calculateStatus(score)}")

    val studentID: String? = null

    val idLength = studentID?.length ?: 0

    println("Panjang ID: $idLength")
}

fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"