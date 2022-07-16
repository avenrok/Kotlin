import kotlin.io.readLine as readLine

fun main() {
    println("Введите количество номеров, которые необходимо добавить:")
    var n = readLine()!!.toInt()
    while (n < 0) {
        println("Введите число больше нуля")
        n = readLine()!!.toInt()
    }
    println("Введите номер!")
    println(" Например: +79238008080")
    val numbers: List<String> = listNu(n)
    val trueListNumber = numbers.filter { it.startsWith("+7") }
    println(trueListNumber)
    println(trueListNumber.toSet().size)
    println("Sum:" + trueListNumber.sumOf { it.length })
    trueListNumber.associateBy {
        println(it)
        readLine()
    }.entries.forEach {
        println("Абонент: ${it.key}. Номер телефона ${it.value}" )
    }
    
}

fun listNu(n: Int): List<String> {
    val mutableContactList = mutableListOf<String>()
    repeat(n) {
        mutableContactList.add(readLine()!!)
    }
    return mutableContactList
}