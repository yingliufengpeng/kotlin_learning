package kotlin_learning.P19_Enum_demo

enum class Week {
    Mon,
    Tue,
    Wed,
    Thu,
    Fri,
    Sat,
    Sun,

}

fun main() {

    println(Week.Mon.name)
    println(Week.Mon.ordinal)

}