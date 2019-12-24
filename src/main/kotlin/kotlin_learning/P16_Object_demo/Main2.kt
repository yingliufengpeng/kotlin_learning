package kotlin_learning.P16_Object_demo

interface Driver {
    fun drive()
}

interface Writer {
    fun write()
}

class Manager: Driver, Writer {
    override fun drive() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun write() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

// 方法代理
class SeniorManager(driver: Driver, writer: Writer): Driver by driver, Writer by writer {
//    override fun drive() {
//        driver.drive()
//    }
//
//    override fun write() {
//       writer.write()
//    }
}

class CarDriver: Driver {
    override fun drive() {
        println("开车")
    }
}

class PPtWriter: Writer {
    override fun write() {
        println("PPt写得不错")
    }
}

fun main() {

    val driver = CarDriver()
    val writer = PPtWriter()

    val seniorManager = SeniorManager(driver, writer)

    seniorManager.drive()
    seniorManager.write()


}