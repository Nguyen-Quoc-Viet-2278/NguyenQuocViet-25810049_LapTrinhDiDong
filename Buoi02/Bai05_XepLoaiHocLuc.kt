// Nguyen Quoc Viet - 25810049
fun main () {
    val diemTB :Double = 8.1
   val xepLoai: String = when (diemTB) {
       in 8.5..10.0 ->"Xuất sắc"
       in 7.0.. 8.4->"Gioi"
       in 5.5.. 6.9->"Khá"
       in 4.0 ..5.4->"Trung binh"
       else -> "yếu"
	}
    println("Điểm trung bình: $diemTB")
    println("Xếp loại: $xepLoai")
  

}