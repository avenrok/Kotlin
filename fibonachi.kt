import java.math.BigInteger

fun main() {
    var b = true
    while (b) {
        println("Введите число:")
        var n = readLine()!!.toLong()
        if (n < 0) {
            while (n < 0) {
                println("Введите число, которое больше нуля")
                n = readLine()!!.toLong()
                b = false
            }
        }
        if (n >0){
            println("\nFibonacci '$n': ")
            println( fibonacci(BigInteger.ZERO, BigInteger.ONE, BigInteger.valueOf(n)))
            b = false
        }
    }
}
tailrec fun fibonacci(a: BigInteger, b: BigInteger, n: BigInteger): BigInteger {
    println("$a, ")
    return if (n == BigInteger.ZERO) a else fibonacci(b, a + b, n - BigInteger.ONE)
}
