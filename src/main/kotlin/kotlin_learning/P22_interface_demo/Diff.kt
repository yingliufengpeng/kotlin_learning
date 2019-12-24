package kotlin_learning.P22_interface_demo

abstract class A {
    var i = 0

    fun hello() {
        println("i is $i")
    }
}

interface B {
    var j: Int

    fun hello2() {
        println("i is $j")
    }

}


class D: B {
    var _j = 0
    override var j: Int
        get() = _j
        set(value) {
            _j = value
        }
}

class D2(override var j: Int): B {

}

class E: A() {

}