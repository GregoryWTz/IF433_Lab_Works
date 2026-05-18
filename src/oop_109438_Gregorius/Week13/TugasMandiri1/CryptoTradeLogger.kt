package oop_109438_Gregorius.Week13.TugasMandiri1
import java.io.File

data class TradeRecord(val id: Int, val symbol: String, val type: String, val margin: Double, val pnl: Double)

fun TradeRecord.toCsv(): String {
    return "$id,$symbol,$type,$margin,$pnl"
}