package kotlin_learning.P10_list_map

import java.util.*

fun main() {

    val lists = listOf("A", "B", "C", "D")

    for (list in lists)
        println(list)

    for ((index, list) in lists.withIndex())
        println("$index, $list")


    val map = TreeMap<String, String>()
    map["学习"] = "Good"
    map["天"] = "Study"

    println(map)
}