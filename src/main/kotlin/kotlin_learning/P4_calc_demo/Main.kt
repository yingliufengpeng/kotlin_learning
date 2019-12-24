package kotlin_learning.P4_calc_demo

fun main() {

    val a = 3
    val b = 4

    val c = plus(a, b)

    println("c is $c")

}


fun plus(a: Int, b: Int): Int = a + b