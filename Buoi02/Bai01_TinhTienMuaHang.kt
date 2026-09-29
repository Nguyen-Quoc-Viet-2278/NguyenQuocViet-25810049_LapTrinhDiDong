// Nguyen Quoc Viet - 25810049
fun main() {
    val soLuong: Int = 5
  	val donGia: Double = 100000.0

    val tienHang  = soLuong.toDouble() * donGia  
	val tongTien = tienHang * 1.08

  	println("Số lượng: " + soLuong + " sản phẩm")
    println("Đơn giá: ${donGia} VNĐ")
    println("Tổng tiền (đã có thuế 8%): ${tongTien} VNĐ")
}