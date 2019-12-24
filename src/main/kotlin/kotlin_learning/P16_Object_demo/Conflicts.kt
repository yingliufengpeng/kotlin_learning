package kotlin_learning.P16_Object_demo

interface B {

    fun x(): Int = 1
}

interface C {
    fun x(): Int = 0
}

abstract class A {
    open fun x(): Int = 5
}

class D(val y: Int = 0) : A(), B, C {

    override fun x(): Int {
        println("调用D中的方法")
        if (y > 0)
            return y
        else if (y < -200)
            return super<B>.x()
        else if (y < -100)
            return super<A>.x()
        else
            return super<C>.x()
    }


}

fun main() {

    val d = D()
    val r = d.x()
    println(r)

    val d2 = D(-150)
    val r2 = d2.x()
    println(r2)

}