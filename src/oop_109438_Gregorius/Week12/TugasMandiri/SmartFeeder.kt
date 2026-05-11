package oop_109438_Gregorius.Week12.TugasMandiri

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }
    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    try {
        dispenseKibble(80, currentKibbleStock, false)
    } catch (e: DispenserJamException) {
        println(e.message)
    } catch (e: FoodEmptyException) {
        println(e.message)
    } catch (e: Exception) {
        println(e.message)
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    runCatching { dispenseKibble(30, 1000, false) }
}