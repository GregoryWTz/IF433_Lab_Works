package oop_109438_Gregorius.Week2.TugasMandiri1

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan Judul Buku: ")
    val title = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val name = scanner.nextLine()

    print("Durasi Pinjam (hari): ")
    var duration = scanner.nextInt()

    if (duration < 0) {
        println("LOG: Input tidak valid ($duration Hari). Durasi di reset menjadi 1")
        duration = 1
    }

    val loan1 = Loan(title, name, duration)

    println("\n--- Ringkasan Pinjaman ---")
    println("Peminjam: ${loan1.borrower}")
    println("Buku    : ${loan1.bookTitle}")
    println("Durasi  : ${loan1.loanDuration} hari")
    println("Denda   : Rp ${loan1.calculateFine()}")

    println("--------------------------")
}