object PerfectSquare {
  def main(args : Array[String]):Unit={
    //18) check if a given number is perfect square using "while" loop
val num = 16
    var i=0
    while(i*i<num){
      i+=1
      if(i*i==num){
        print("Given number is a perfect square")
      }
    }


  }

}
