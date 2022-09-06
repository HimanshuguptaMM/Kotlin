open class ObjectExpressionCon(name: String, age: Int) {

    init {
        println("name: $name, age: $age")
    }

    fun eat() = println("Eating food.")
    fun talk() = println("Talking with people.")
    open fun pray() = println("Praying god.")
}

fun main(args: Array<String>) {
    val atheist = object : ObjectExpression() {
        override fun pray() = println("I don't pray.")
    }

    atheist.eat()
    atheist.talk()
    atheist.pray()
}