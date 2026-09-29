// Nguyen Quoc Viet - 25810049
fun main () {
    val cannang: Int= 58
    val chieucao : Double = 1.67
    val bmi = cannang / (chieucao * chieucao)
    if (bmi < 18.5) {
        println("Gầy")
	} else if(bmi < 24.5) {
        println ("Bình thường")
	} else if (bmi < 30) {
        println ("Hơi béo")
    } else {
        println ("Quá số bmi")
	}
    println("Chỉ số : $bmi")
}