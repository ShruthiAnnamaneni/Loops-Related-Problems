object PrimeNumber {
  def main(args: Array[String]):Unit={
    // 10) Check if a number is prime using "while" loop
    val num=10
    var i=1
    var count=0
    while(i<=num){
      if(num%i==0){
        count+=1
      }
      i+=1
    }
    if(count==2){
      print("Given number is prime")
    }
    else{
      print("Given number is not prime")
    }

  }

}
