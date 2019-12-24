package kotlin_learning.P11_function_lambda

fun main() {

    val f = { x: Int, y:Int -> x + y}

    println(f(3, 4))

    val f2: (Int, Int) -> Int = {x, y -> x + y}

    println(f2(3, 4))
}