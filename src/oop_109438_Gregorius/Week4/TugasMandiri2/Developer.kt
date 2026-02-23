package oop_109438_Gregorius.Week4.TugasMandiri2

open class Developer(name: String, baseSalary: Int, val programmingLanguage: String) : Employee(name, baseSalary) {
    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage")
    }
}