package kotlin_system_learning.p28_static_member

fun main() {

    val a = minOf(3, 4)
    println("a is $a")

    val latidude = Latidude.valueOf(4.0)

    println(latidude)

    println(Latidude.TAG)

}

class Latidude private constructor(val value: Double) {

    companion object {

        @JvmStatic
        fun valueOf(double: Double): Latidude {
            return Latidude(double)
        }

        @JvmStatic
        fun ofLatitude(latidude: Latidude): Latidude {
            return Latidude(latidude.value)
        }

        @JvmField
        val TAG = "Latitude"
    }

    override fun toString(): String {
        return "Latidude(value=$value)"
    }

}