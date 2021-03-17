fun main() {

    var car = Car()

    println(car.wheels)
    println(car.wheels.isEmpty())

    val wheel: Wheel = Wheel(null)

    println(wheel.name)
    println(wheel.type)

    wheel.type = "타이어"

    println(wheel.type)

}

class Car {
    val wheels = listOf<Wheel>()
}

class Wheel(val name: String?) {

    var type: String = ""

    init {
        type = "바퀴"
    }

}

class Test (
    val first: String,
    val middle: String,
    var last: String,
)

