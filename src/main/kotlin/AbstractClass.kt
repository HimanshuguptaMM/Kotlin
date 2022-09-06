abstract class AbstractClass(_name: String) {
    var name: String
    abstract var age: Int

    // Initializer Block
    init {
        this.name = _name
    }

    abstract fun setPersonAge(_age:Int)
    abstract fun getPersonAge():Int

    fun getPersonName(){
        println("Name = $name")
    }
}
class Employee(_name: String): AbstractClass(_name) {
    override var age: Int = 0

    override fun setPersonAge(_age: Int) {
        age = _age
    }
    override fun getPersonAge():Int {
        return age
    }
}

fun main(args: Array<String>) {
    val employee = Employee("SpiderMan")
    var age : Int

    employee.setPersonAge(20)

    age = employee.getPersonAge()

    employee.getPersonName()
    println("Age = $age")

}