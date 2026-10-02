// NguyenQuocViet_2581049
interface DeTinhDienTich {
    fun DienTich(): Double
}

class HinhVuong(val canh: Double) : DeTinhDienTich {
    override fun DienTich(): Double {
        return canh * canh
    }
}

class HinhTron(val banKinh: Double) : DeTinhDienTich {
    override fun DienTich(): Double {
        return 3.14 * banKinh * banKinh
    }
}

fun main() {
    val hinhVuong = HinhVuong(5.0)
    val hinhTron = HinhTron(9.0)

    println("Dien tich hinh vuong: " + hinhVuong.DienTich())
    println("Dien tich hinh tron: " + hinhTron.DienTich())
}