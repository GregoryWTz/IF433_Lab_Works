package oop_109438_Gregorius.Week8.TugasMandiri1

sealed class Product

data class Electronic(val id: String, val name: String, val warrantyMonths: Int) : Product()

data class Clothing(val id: String, val name: String) : Product()