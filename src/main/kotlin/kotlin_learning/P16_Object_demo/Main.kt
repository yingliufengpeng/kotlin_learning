package kotlin_learning.P16_Object_demo

class Rect(width: Int, height: Int) {
    fun show() {
        println(this)
    }
}

class WashMachine(moudle: String, size: Int) {



}

open class Father(val chactor: String) {

    open fun action() {
        println("公共场合喜欢大声喧哗")

    }
}

open class Son(val name: String, chactor: String): Father(chactor) {
    override fun action() {
        println("公共场合喜欢很有礼貌")
    }
}

class M: Son("", "")

abstract class Option<out T>

class Some<out T>(val t: T): Option<T>()

abstract class Person(open val age: Int) {
    abstract fun work()
}

class Coder(age: Int): Person(age) {

    override fun work() {
//        super.work()
        println("我是程序设计者,我在写代码")
    }
}

class Doctor(age: Int): Person(age) {

    override val age: Int
        get() = 22

    val age2: Int
        get() = 22

    override fun work() {
//        super.work()
        println("我是医生,我在给我的病人看病")
    }
}

fun main() {

//    val r = Rect(3, 4)
//    r.show()
//
//    val son = Son("w", "kk")
//    son.action()
//
//    val m = listOf("kk")

    val coder = Coder(33)
    val doctor = Doctor(44)

    coder.work()
    doctor.work()

    println(doctor.age2)
    println(doctor.age)


}