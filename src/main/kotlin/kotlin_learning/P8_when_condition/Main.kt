package kotlin_learning.P8_when_condition

fun main() {

    gradeStudent(8)

    diaryGenerator("颐和园")

}

fun gradeStudent(score: Int) {

    when (score) {
        10 -> println("你很优秀!!!")
        9 -> println("干的不错!!!")
        8 -> println("还可以!!!")
        7 -> println("还需要努力!!!")
        6 -> println("刚好及格!!!")
        else -> println("还需要努力!!!")

    }
}

fun diaryGenerator(placeName: String) {

    val diary = """
        中山公园我们去开始游玩的过程!!!
        $placeName
        ${num2Chinese(placeName.length)}
    """.trimIndent()

    println(diary)
}

fun num2Chinese(num: Int): String {

    val result = when (num) {
        1 -> "一"
        2 -> "二"
        3 -> "三"
        4 -> "四"
        else -> "未知地名"
    }

    return result

}