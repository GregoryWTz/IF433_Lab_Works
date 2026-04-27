package oop_109438_Gregorius.Week10.TugasMandiri1

interface Named {
    val name: String
}

class WalletRepository<T>(private val items: MutableList<T> = mutableListOf()) {
    fun add(item: T) {
        items.add(item)
    }

    fun getAllItems(): List<T> {
        return items
    }

    fun findByName(query: String): List<T> {
        return items.filter { item ->
            val named = item as? Named  // safe cast
            named?.name?.contains(query, ignoreCase = true) ?: false
        }
    }
}