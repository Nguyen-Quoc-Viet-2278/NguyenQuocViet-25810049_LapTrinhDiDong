// Nguyen Quoc Viet - 25810049

fun dinhDangDiaChi(
    hoTen: String,
    soNha: String,
    phuong: String = "Phường 1",
    thanhPho: String = "TP. Hồ Chí Minh"
) {
    println("Họ tên: $hoTen")
    println("Địa chỉ: $soNha,  $phuong, $thanhPho")
}

fun main() {
    dinhDangDiaChi(
        hoTen = "Quoc Viet",
        soNha = "123",
        phuong = "Bình Thạnh",
        thanhPho = "hcm"
    )
}