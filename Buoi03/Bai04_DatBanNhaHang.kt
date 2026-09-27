// Nguyen Quoc Viet - 25810049
fun datBan(tenKhach: String, soLuongKhach: Int, loaiBan: String = "bàn thường") {
    println("Đặt bàn cho $tenKhach, $soLuongKhach khách, loại: $loaiBan")
}
fun main() {
    datBan("An", 3)
    datBan("Bình", 4, "bàn VIP")
    datBan(tenKhach = "Châu", soLuongKhach = 6, loaiBan = "bàn ngoài trời")
}