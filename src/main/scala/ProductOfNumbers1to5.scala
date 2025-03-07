object ProductOfNumbers1to5 {
  def main(args: Array[String]):Unit={
    // 17) Calculate the product of numbers 1 to 5 using "for" loop
    var product=1
    for(i<-1 to 5 by 1){
      product*=i
    }
    println("Product of numbers 1 to 5 is "+product)
  }

}
