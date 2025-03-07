object FactorialOfNumber {
  def main(args: Array[String]):Unit={
    // 8) calculate the factorial of a given number using a for loop
    val number=4
    var result=1
    for(i<-1 to number by 1){
      result *= i
    }
    print("factorial is " +result )
  }

}
