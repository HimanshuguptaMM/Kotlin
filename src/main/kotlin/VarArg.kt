fun main(args: Array<String>) {
    fun getAverage(vararg input: Int): Float {
        var sum = 0.0f
        for (item in input) {
            sum += item
        }
        return (sum / input.size)
    }

    val result1 = getAverage(1, 2, 3)
    val result2 = getAverage(1, 2, 3, 4, 5)

}