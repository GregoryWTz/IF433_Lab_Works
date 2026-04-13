package oop_109438_Gregorius.Week8.TugasMandiri1

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        val id = requireNotNull(rawJson["id"]) { "API Invalid: Missing ID" } as String
        val name = requireNotNull(rawJson["name"]) { "API Invalid: Missing Name" } as String

        return when (rawJson["type"] as? String) {

            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12
                Electronic(id, name, warranty)
            }

            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"
                Clothing(id, name, size)
            }

            else -> null
        }
    }

    fun checkout(product: Product, rawJson: Map<String, Any?>) {

        when (product) {
            is Electronic -> {
                val isFallback = rawJson["warranty"] !is Int

                if (isFallback) {
                    println("${product.name} (Fallback Warranty ${product.warrantyMonths})")
                } else {
                    println("${product.name} (Warranty ${product.warrantyMonths})")
                }
            }

            is Clothing -> {
                println("${product.name} (Size ${product.size})")
            }
        }

        val transactionId = JavaPaymentService.processPayment(
            when (product) {
                is Electronic -> product.id
                is Clothing -> product.id
            }
        )!!

        println("Transaction successful! ID: $transactionId")
    }
}