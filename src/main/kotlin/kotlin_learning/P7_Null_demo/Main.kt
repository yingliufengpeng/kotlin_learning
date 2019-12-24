package kotlin_learning.P7_Null_demo


fun main() {

    println(heat("水"))
    println(heat("狗"))
    println(heat(null))

}

fun heat(str: String?): String {


    return "热$str"
}