package oop_109438_Gregorius.Week12.TugasMandiri

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }
    return if (isJammed) throw DispenserJamException() else availableGram - requestedGram
}