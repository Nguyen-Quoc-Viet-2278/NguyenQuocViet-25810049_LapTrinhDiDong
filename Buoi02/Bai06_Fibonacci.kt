// Nguyen Quoc Viet - 25810049
fun main () {
 	var a = 0
    var b = 1
    var vitri = 1

    println("Vị trí $vitri: $a")

    for (i in 1..100) {
        if (a >= 100) break
        vitri++
        println("Vị trí $vitri: $b")
        val temp = a + b
        a = b
        b = temp
    }
}

