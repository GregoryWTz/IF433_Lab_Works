package oop_109438_Gregorius.Week2.TugasMandiri2

import java.util.Scanner

fun main() {
    val Scanner = Scanner(System.`in`)

    print("Masukan Nama Hero: ")
    val HeroName = Scanner.nextLine()

    print("Masukkan Damage Hero: ")
    val stat = Scanner.nextInt()

    var enemyHp = 100

    var hero1 = hero(HeroName, stat)

    print("\nMusuh terlihat!")
    while(hero1.isAlive() && enemyHp > 0) {
        println("\n--- Menu ---")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")
        val choice = Scanner.nextInt()

        if (choice == 1) {
            hero1.attack("Musuh")
            enemyHp -= hero1.baseDamage

            if (enemyHp < 0) enemyHp = 0
            println("HP Musuh tersisa: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Musuh menyerang balik, memberikan damage sebesar $enemyDamage!")
                hero1.takeDamage(enemyDamage)
                println("HP ${hero1.name} tersisa ${hero1.hp}")
            }
        } else if (choice == 2) {
            println("${hero1.name} memilih untuk kabur dari petarungan!")
            break
        } else {
            println("Pilihan tidak valid")
        }
    }

    println("\n--- HASIL ---")
    if (enemyHp <= 0) {
        println("Selamat! ${hero1.name} berhasil mengalahkan musuh!")
    } else if (!hero1.isAlive()) {
        println("Game Over... ${hero1.name} telah gugur")
    } else {
        println("Pertarungan berakhir karena ${hero1.name} melarikan diri.")
    }
}