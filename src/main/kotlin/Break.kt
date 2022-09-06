fun main(args: Array<String>) {
    outerLoop@ for (i in 1..3) {
        innerLoop@ for (j in 1..3) {
            println("i = $i and j = $j")
            if (i == 2){
                break@outerLoop
            }
        }
    }
}
//// Using break in for loop
//for (...) {
//   if(test){
//      break
//   }
//}
//
//// Using break in while loop
//while (condition) {
//   if(test){
//      break
//   }
//}
//
//// Using break in do...while loop
//do {
//   if(test){
//      break
//   }
//}while(condition)