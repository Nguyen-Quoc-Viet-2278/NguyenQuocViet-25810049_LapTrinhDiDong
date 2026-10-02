abstract class PhuongTienDiChuyen {
    abstract val tocDoToiDa: Int
    
    fun moTa() {
        println("Toc do toi da :" + tocDoToiDa)  
    }
}

class XeMay : PhuongTienDiChuyen() {
    override val tocDoToiDa = 70
}

class OTo : PhuongTienDiChuyen() {
    override val tocDoToiDa = 150
    
}
fun main () {
    val xeMay = XeMay ()
    val oTo = OTo()
    println ("Toc do của xe may :" + xeMay.moTa())
    println ("Toc do của xe o tô:" + OTo.moTa())
 }