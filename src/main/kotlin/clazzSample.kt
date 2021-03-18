import org.omg.CORBA.ORB

fun main() {

    // new 키워드를 사용하지 않아도 된다
    val sample = Sample("test")
    println(sample.name)
    println(sample.firstProperty)
    println(sample.second)

    println("=========================")

    val sample2 = Sample("test2",5)
    println(sample2.name)
    println(sample2.firstProperty)
    println(sample2.second)

    println("=========================")

    val sample3 = Sample("test2", "mid", 10)
    println(sample3.name)
    println(sample3.firstProperty)
    println(sample3.second)

    val Car = Car("소나타")

    val standard = Car()

}

// 1. 주 생성자를 명시한
class Sample constructor(var name: String, print: Unit = println("주 생성자") ) {

    var firstProperty = "name"

    var second = 100

    val length = name.length

    init {
        println("Fist Initial $name")
        firstProperty = "newName1"
        second = 0
        println(firstProperty)
        println(second)
        println(length)
    }

    init {
        println("Second Initial $name")
        firstProperty = "newName2"
        second = 50
        println(firstProperty)
        println(second)
        println(length)
    }

    constructor(name: String, a: Int) : this(name, "3",a) {
        println("부 생성자 호출....")
        firstProperty = "newName"
        second = a
    }

    constructor(name: String, mid: String, a: Int ) : this(name){
        println("부 생성자 2 호출")
        firstProperty = "subName"
        second = a
    }
}

class Car {
    val wheels = listOf<Wheel>()

    constructor(name: String ) : this() {
        println("보조 생성자 $name")
    }

    constructor() {
        println("기본 생성자")
    }
}

class Wheel(val name: String = "바퀴") {

    var type: String = ""

    init {
        type = "넥센"
    }

}

class Test (
    val first: String,
    val middle: String,
    var last: String,
)


