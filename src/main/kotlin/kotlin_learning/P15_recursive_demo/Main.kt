package kotlin_learning.P15_recursive_demo

import java.math.BigInteger

fun main() {

    println(fac(10000, BigInteger.ONE))

    println(fac2(10000))
 }

fun fac(n: Int, acc: BigInteger): BigInteger {
    if (n < 1) {

        return acc
    }
    else
        return fac(n - 1,  acc * BigInteger.valueOf(n.toLong()) )
}

fun fac2(n: Int): BigInteger {
    if (n < 1)
        return BigInteger.ONE

    return fac2(n - 1) * BigInteger.valueOf(n.toLong())
}