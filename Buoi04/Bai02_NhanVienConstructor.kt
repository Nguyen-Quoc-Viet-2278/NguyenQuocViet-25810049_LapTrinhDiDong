// Nguyen Quoc Viet - 25810049
class NhanVien(maNhanVien: String, val ten: String, var luongThang: Double) {
    constructor(ten: String) : this("TAM", ten, 0.0)
}

fun main() {
    val nvthu1 = NhanVien("NV001", "An", 4400000.0)
    val nvthu2 = NhanVien("Binh")

    println("NV1: ${nvthu1.ten}, ${nvthu1.luongThang}")
    println("NV2: ${nvthu2.ten}, ${nvthu2.luongThang}")
}