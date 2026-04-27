package oop_109438_Gregorius.Week10.TugasMandiri1

class WalletRepository<T>(private val items: MutableList<T> = mutableListOf()) {

    fun add(item: T) {
        items.add(item)
    }

    fun getAllItems(): List<T> {
        return items
    }
}