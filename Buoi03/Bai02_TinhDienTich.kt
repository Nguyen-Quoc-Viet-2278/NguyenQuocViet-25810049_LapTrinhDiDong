// Nguyen Quoc Viet - 25810049
fun tinhDienTich(chieuDai: Double, chieuRong: Double): Double {
    return chieuDai * chieuRong
}

val ketQuaDienTich1 = tinhDienTich(5.0, 3.0)
val ketQuaDienTich2 = tinhDienTich(10.5, 4.2)

fun main() {
    println("Diện tích 1: $ketQuaDienTich1")
    println("Diện tích 2: $ketQuaDienTich2")
}