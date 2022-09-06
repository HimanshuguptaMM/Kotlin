fun main(args: Array<String>) {
    val day = 7

    when (day) {
        1 -> {
            println("First day of the week")
            println("Monday")
        }
        2 -> {
            println("Second day of the week")
            println("Tuesday")
        }
        3 -> {
            println("Third day of the week")
            println("Wednesday")
        }
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day.")
    }
}