package kotlin_learning.P5_condition_control

fun main() {

    checkFace(44)

    val str1 = "wang"

    val str2 = "wang"

    val b = str1 == str2
    val b2 = str1.equals(str2, true)

    println("b is $b, b2 is $b2")
}

fun checkFace(score: Int) {
    if (score > 80)
        println("摔哥")
    else
        println("帅哥")

}