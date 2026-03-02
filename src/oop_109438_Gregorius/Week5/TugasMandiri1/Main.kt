package oop_109438_Gregorius.Week5.TugasMandiri1

fun main() {
    val math = MathHelper()

    val luasPersegi = math.hitungLuas(5)
    println("Luas Persegi (sisi=5): $luasPersegi")

    val luasPersegiPanjang = math.hitungLuas(4, 7)
    println("Luas Persegi Panjang (panjang=4, lebar=7): $luasPersegiPanjang")

    val luasLingkaran = math.hitungLuas(3.5)
    println("Luas Lingkaran (jariJari=3.5): $luasLingkaran")
}