package kotlin_learning.P20_seal_demo

sealed class Son {
    class A: Son()
    class B: Son()

    fun sayHello() {
        println("大家好")
    }
}




fun main() {
    val a = Son.A()
    val b = Son.B()
    a.sayHello()
    b.sayHello()
}