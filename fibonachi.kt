import java.math.BigInteger

fun main() {
    var proverka = true
    while (proverka) {
        println("Введите число:")
        var number = readLine()!!.toLong()
        if (number < 0) {
            while (number < 0) {
                println("Введите число, которое больше нуля")
                number = readLine()!!.toLong()
                proverka = false
            }
        }
        if (number >0){
            println("\nFibonacci '$number': ")
            println( fibonacci(BigInteger.ZERO, BigInteger.ONE, BigInteger.valueOf(number)))
            proverka = false
        }
    }
}
tailrec fun fibonacci(a: BigInteger, b: BigInteger, number: BigInteger): BigInteger {
    println("$a, ")
    return if (number == BigInteger.ZERO) a else fibonacci(b, a + b, number - BigInteger.ONE)
}
