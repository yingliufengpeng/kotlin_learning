package kotlin_system_learning.p26_visibility

class House

class Flower

class Countyard {

    private val _house = House()

    private val _flower = Flower()




}

class ForbiddenCity {
    val houses = listOf(House(), House())

    val flowers = listOf(Flower(), Flower())
}

fun main() {

    val countyard = Countyard()

    val forbiddenCity = ForbiddenCity()

    println(forbiddenCity.flowers)


}

