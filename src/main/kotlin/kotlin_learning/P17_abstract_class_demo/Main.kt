package kotlin_learning.P17_abstract_class_demo

abstract class Human(val name: String) {

    abstract fun eat()
}

class Man(name: String): Human(name) {
    override fun eat() {
        println("$name 大口吃东西")
    }
}

class WoMan(name: String): Human(name) {
    override fun eat() {
        println("$name 小口吃东西")
    }
}

interface IMan {
    fun walk()
}

class Man2(name: String): Human(name), IMan {
    override fun eat() {
        println("$name 大口吃东西")
    }

    override fun walk() {
        println("男人健壮的走路!!!")
    }
}

fun Walk(walk: IMan) {

    walk.walk()
}

fun main() {

    val man = Man("wang")
    man.eat()

    val woman = WoMan("wang")
    woman.eat()

    val man2 = Man2("wang")
    man2.walk()

}