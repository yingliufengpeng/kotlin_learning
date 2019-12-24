package kotlin_learning.P9_loop_control

fun main() {

    val nums = 1 .. 100
    var sum = 0
    for (n in nums) {
        println(n)
        sum += n
    }

    println("sum is $sum")


    val nums2 = 1 until 100
    nums2.forEach { println(it) }

    println("-----------")
    (1 .. 100 step 2).forEach { println(it) }


    println(nums2.count { it % 2 == 0 })


}