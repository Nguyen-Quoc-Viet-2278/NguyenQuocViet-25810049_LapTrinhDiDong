// Nguyen Quoc Viet - 25810049
fun main () {
   val sach = mutableListOf(
        "Dac nhan tam", 
       "Truyen tranh", 
       "Tham tử", 
       "Sach đọc giả", 
       "tieu thuyet"
    )
     println("Danh sach ban dau: $sach")
     sach.add("sach co tich")
     sach.add("sach trinh tham")
     
     sach.remove("tieu thuyet")
      sach.sort()
      println("Danh sach sau khi xu ly: $sach")
     
}
