fun main() {
    val word: String = "F2p)v\"y233{0->c}ttelciFc"
    algoritmForFirstPart(word)
    algoritmForlastPart(word)
}
fun algoritmForFirstPart(word: String){
    val operations = word.take(12)

    val endFirst = operations.map{ char -> char + 1 }.joinToString("")
        .replace("4","u")
        .map{ char -> char - 3 }.joinToString("")
        .replace("0","o")
    println(endFirst)
}
fun algoritmForlastPart(word: String){
    val lastPart = word.takeLast(12)

    val endLast = lastPart.reversed()
        .map{ char -> char - 4 }.joinToString("")
        .replace("_"," ")
    println(endLast)
}