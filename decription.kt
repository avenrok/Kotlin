fun main() {
    val word: String = "F2p)v\"y233{0->c}ttelciFc"
    val firstPart = word.take(12)
    val lastPart = word.takeLast(12)
    // Обработка первой половины
    val sdvigFirst = firstPart.map{ char -> char + 1 }.joinToString("")
    val zamenaOneFirst = sdvigFirst.replace("4","u")
    val sdvigFirstTwo = zamenaOneFirst.map{ char -> char - 3 }.joinToString("")
    val endFirst = sdvigFirstTwo.replace("0","o")
    //Обработка второй половины
    val reversLast = lastPart.reversed()
    val sdvigLast = reversLast.map{ char -> char - 4 }.joinToString("")
    val endLast = sdvigLast.replace("_"," ")

    println(endFirst)
    println(endLast)
}
