package kotlin_learning.P22_interface_demo

import java.lang.IllegalArgumentException

interface InputDevice {
    fun input(event: Any)
}

interface USBInputDevice : InputDevice

interface BLEInputDevice : InputDevice

class Computer {
    fun addUSBInputDevice(usbInputDevice: USBInputDevice) {
        println("add USB Device")
    }

    fun addBLEInputDevice(bleInputDevice: BLEInputDevice) {
        println("add BLE Device")
    }

    fun addInputDevice(inputDevice: InputDevice) {
        when (inputDevice) {
            is BLEInputDevice -> addBLEInputDevice(inputDevice)
            is USBInputDevice -> addUSBInputDevice(inputDevice)
            else ->
                throw IllegalArgumentException("输入的设备类型不支持!!!")
        }
    }

}

interface OpticalMouse

abstract class USBMOuse(val name: String) : USBInputDevice, OpticalMouse {
    override fun input(event: Any) {
        TODO()
    }

    override fun toString(): String {
        return name
    }
}

class LogitechMouse : USBMOuse("逻辑思维")


fun main() {
    val computer = Computer()

    val mouse = LogitechMouse()

    computer.addInputDevice(mouse)

    val d = D()

    d.j = 3
    println("d.j is ${d.j}")

    val e = E()

    println(e)


    val d2 = D2(3)
    println(d2)

}