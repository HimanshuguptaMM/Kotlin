class myClass {
    // Property (data member)
    private var name: String = "Multiverse Is Real"

    // Member function
    fun printMe() {
        print("hey")
    }
}
fun main(args: Array<String>) {
    val obj = myClass() // Create object obj of myClass class
    obj.printMe() // Call a member function using object
}