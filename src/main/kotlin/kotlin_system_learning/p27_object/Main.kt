package kotlin_system_learning.p27_object

class Driver

interface OnExternalDriverMountListener {

    fun onMount(driver: Driver)

    fun onUnmount(driver: Driver)
}

abstract class Player {
    abstract fun play(url: String)
    abstract fun stop()
}

object MusicPlayer: Player(), OnExternalDriverMountListener{

    val state = 0

    override fun play(url: String) {

    }

    override fun stop() {

    }

    override fun onMount(driver: Driver) {

    }

    override fun onUnmount(driver: Driver) {

     }
}

fun main() {

    MusicPlayer.play("kk")
    MusicPlayer.stop()

}