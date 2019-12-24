package kotlin_learning.P14_exception_demo

fun main() {

    while (true) {
        try {
            println("请输入第一个数字:")
            val num1str = readLine()

            println("请输入第二个数字")
            val num2str = readLine()

            val num1 = num1str!!.toInt()
            val num2 = num2str!!.toInt()

            println("$num1 + $num2 = ${num1 + num2}" )
        } catch (e: Exception) {
            println("产生异常信息!!!")
        }
    }


}