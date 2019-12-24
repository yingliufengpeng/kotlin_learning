package kotlin_learning.P21_expaned_member

fun main(args: Array<String>) {

    val r = "44".times(4)
    println(r)



}

fun String.times(n: Int): String {
   val stringBuffer = StringBuffer()
    (1 .. n).toList().forEach{
        stringBuffer.append(this)
    }
    return stringBuffer.toString()
}