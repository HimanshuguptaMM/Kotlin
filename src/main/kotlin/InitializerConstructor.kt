class Person{
    // Member Variables
    var name: String
    var age: Int

    // Initializer Block
    init {
        println("Initializer Block")
    }

    // Secondary Constructor
    constructor ( _name: String, _age: Int) {
        this.name = _name
        this.age = _age
        println("Name = $name")
        println("Age = $age")
    }
}

fun main(args: Array<String>) {
    val zara = Person("Spiderman", 20)
}