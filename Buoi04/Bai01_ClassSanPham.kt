 // Nguyen Quoc Viet - 25810049
class SanPham(val tenSanPham: String, val gia: Double, val soLuongTonKho: Int = 0)

fun main() {
    val sp1 = SanPham("Bút bi", 5000.0, 100)
    val sp2 = SanPham(tenSanPham = "Vở kẻ", gia = 15000.0) 

    println("SP1: ${sp1.tenSanPham}, ${sp1.gia}, ${sp1.soLuongTonKho}")
    println("SP2: ${sp2.tenSanPham}, ${sp2.gia}, ${sp2.soLuongTonKho}")
}v
