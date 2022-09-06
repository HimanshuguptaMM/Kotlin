class Constructor(val _name: String, val _age: Int) {
    // Member Variables
    var name: String
    var age: Int

    // Initializer Block
    init {
        this.name = _name
        this.age = _age
        println("Name = $name")
        println("Age = $age")
    }
}

fun main(args: Array<String>) {
    val person = Person("Peter", 20)
}