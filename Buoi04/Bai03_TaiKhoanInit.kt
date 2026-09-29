
class TaiKhoanNganHang(val soTaiKhoan: String, val soDuBanDau: Double) {
    var soDu = soDuBanDau

    init {
        if (soDuBanDau < 10000) {
            println("So du khong hop le")
        } else {
            println("Tao tai khoan thanh cong, so du ban dau: $soDuBanDau")
        }
    }
}

fun main() {
    val tk1 = TaiKhoanNganHang("TK001", 500000.0)
    val tk2 = TaiKhoanNganHang("TK002", -100.0)
}