package kotlin_system_learning.p29_method_overload

class Overloads {

    @JvmOverloads
    fun a(a: Int = 0, b: Int = 0) = 0

//    fun a(a: Int) = 0
//
//    fun a(): Int = 0

}


fun main() {

    val overloads = Overloads()

    overloads.a()
    overloads.a(3)
    overloads.a(3, 4)
}