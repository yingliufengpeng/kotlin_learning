package kotlin_learning.P18_delegate_proxy_demo

interface IWashWowl {
    fun washing()
}


object BigHeadSon: IWashWowl {
    override fun washing() {
        println("大头儿子洗碗!!!")
    }
}

// 委托的思路,我很喜欢!!!
class SmallHeadFather: IWashWowl by BigHeadSon {
    override fun washing() {
        println("我是大头爸爸,我赚了1块钱")
        BigHeadSon.washing()
        println("我看着儿子来进行洗碗")
    }
}

fun main() {

    val son = BigHeadSon

    val father = SmallHeadFather()

    val list = listOf(son, father)

    list.forEach{it.washing()}

}