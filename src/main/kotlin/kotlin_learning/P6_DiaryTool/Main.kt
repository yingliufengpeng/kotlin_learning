package kotlin_learning.P6_DiaryTool

fun main() {

    diaryGenerater("虚于应付")
}

fun diaryGenerater(placeName: String): String {


    val temple = """
        今天的天气很晴朗,处处好风光光!!! 
        $placeName
    """.trimIndent()

    return temple
}