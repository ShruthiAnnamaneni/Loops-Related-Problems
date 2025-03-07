object SumOfEvenNumbers1to20 {
def main(args: Array[String]):Unit={
  //12) sum of all even numbers from 1 to 20 using "while" loop
  var num=1
  var sum=0
  while(num<=20) {
    if (num % 2 == 0) {
      sum += num
    }
    num += 1
  }
  println("The sum of all even numbers from 1 to 20 is: " +sum)
}
}
