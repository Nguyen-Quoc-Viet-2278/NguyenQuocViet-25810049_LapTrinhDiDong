open class DongVat(val ten: String) {

    open fun keu(): String {
        return "Dong vat keu"
    }
}
class Cho(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Gau gau"
    }
}

class Meo(ten: String) : DongVat(ten) {

    override fun keu(): String {
        return "Meo meo"
    }
}

fun main() {

    val danhSach = listOf(
        Cho("Cho"),
        Meo("Meo")
    )

    for (dongVat in danhSach) {
        println(dongVat.ten)
        println(dongVat.keu())
    }
}

