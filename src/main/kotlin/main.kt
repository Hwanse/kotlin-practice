

fun main() {
    println("Hello World!")

    var count : Int = 0
    println(count)

    count = 10
    println(count)

    val name : String = "Hello Kotlin"
    println(name)

    var local = 165

    println(local)

    var test : String? = null
    println(test)

    test = "Not null"
    println(test)

    val answer = if (count != null) {
        "I am String"
    } else {
        "Not String"
    }

    println(answer)

    val answerString = when {
        count == 0 -> "I am 0"
        count == 10 -> "I am 10"
        count.equals("ddd") -> "No Number"
        else -> "Nothing"
    }

    println(answerString)

    val stringLengthFunc: (String) -> Int = { input ->
        input.length
    }

    println(stringLengthFunc("apple"))

    var foo = Foo()

}