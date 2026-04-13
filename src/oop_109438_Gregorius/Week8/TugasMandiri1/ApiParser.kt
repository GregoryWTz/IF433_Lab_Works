package oop_109438_Gregorius.Week8.TugasMandiri1

fun parseProduct(rawJson: Map<String, Any?>): Product? {
    val id = requireNotNull(rawJson["id"]) { "API Invalid: Missing ID" } as String
    val name = requireNotNull(rawJson["name"]) { "API Invalid: Missing Name" } as String

    val type = rawJson["type"] as? String

    return when (type) {
        "ELECTRONIC" -> {
            val warranty = rawJson["warrantyMonths"] as? Int ?: 12
            Electronic(id, name, warranty)
        }
        "CLOTHING" -> {
            val size = rawJson["size"] as? String ?: "All Size"
            Clothing(id, name, size)
        }
        else -> null
    }
}

fun checkout(product: Product) {
    val id = when (product) {
        is Electronic -> product.id
        is Clothing -> product.id
    }

    val transactionId = JavaPaymentService.processPayment(id)!!

    println("Transaction successful! ID: $transactionId")
}