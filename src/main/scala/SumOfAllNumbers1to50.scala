object SumOfAllNumbers1to50 {
  def main(args: Array[String]):Unit={
    //3)Calculate the sum of all numbers from 1 to 50 using a "for" loop.
    var sum=0
    for(i<-1 to 50 by 1){
      sum+=i
    }
    print("sum of even numbers from 1 to 50 is", sum)
  }
}
