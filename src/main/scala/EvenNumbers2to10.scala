object EvenNumbers2to10 {
  def main(args:Array[String]):Unit={
    //2)Print even numbers from 2 to 10 using a "while" loop.
    var i=1
    while(i<=10){
      if(i%2==0){
        print(i+" ")
      }
      i+=1
    }
  }

}
