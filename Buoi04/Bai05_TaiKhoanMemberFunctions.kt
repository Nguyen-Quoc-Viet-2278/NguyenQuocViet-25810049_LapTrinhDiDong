
class TaiKhoanNganHang(
    val soTaiKhoan: String,
    var soDu: Double
) {

    fun napTien(soTien: Double) {
        soDu = soDu + soTien
    }

    fun rutTien(soTien: Double): Boolean {
        if (soDu >= soTien) {
            soDu = soDu - soTien
            return true
        }

        return false
    }
}

fun main() {

    val taiKhoan = TaiKhoanNganHang("0255037", 20000000.0)

    taiKhoan.napTien(10000.0)

    println("So du sau khi nap tien: " + taiKhoan.soDu)

    val ketQua = taiKhoan.rutTien(234000.0)

    println("Ket qua rut tien: " + ketQua)

    println("So du sau khi rut tien: " + taiKhoan.soDu)
}

