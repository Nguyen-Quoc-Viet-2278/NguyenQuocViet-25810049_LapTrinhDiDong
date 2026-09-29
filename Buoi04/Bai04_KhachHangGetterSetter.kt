class KhachHang(
    var ho: String,
    var ten: String
) {

    var hoTen: String
        get() {
            return ho + " " + ten
        }
        set(value) {
            val phan = value.split(" ")

            ho = phan[0]
            ten = phan[1] + " " + phan[2]
        }
}

fun main() {

    val kh = KhachHang("Nguyen", "Viet")

    println(kh.hoTen)

    kh.ten = "Quoc"
    println(kh.hoTen)

    kh.hoTen = "Tran Van Nam"

    println(kh.ho)
    println(kh.ten)
}