fun main(args: Array<String>) {  //
    var i = 0;
    while (i++ < 100) {
        if( i == 3 ){
            continue
        }
        println(i)
    }
}
//// Using continue in for loop
//for (...) {
//   if(test){
//      continue
//   }
//}
//
//// Using continue in while loop
//while (condition) {
//   if(test){
//      continue
//   }
//}
//
//// Using continue in do...while loop
//do {
//   if(test){
//      continue
//   }
//}while(condition)