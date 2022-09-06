fun main(args: Array<String>) {
    val age:Int = 20

    val result = if (age > 12) {
        if ( age > 12 && age  < 20 ){
            "Teen"
        }else{
            "Adult"
        }
    } else {
        "Minor"
    }
    print("The value of result : ")
    println(result)
}