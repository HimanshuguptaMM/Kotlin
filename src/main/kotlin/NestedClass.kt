fun main(args: Array<String>) {
    val obj = Outer.Nested()

    print(obj.foo())
}
class Outer {
    class Nested {
        fun foo() = "Hello,Peter"
    }
}