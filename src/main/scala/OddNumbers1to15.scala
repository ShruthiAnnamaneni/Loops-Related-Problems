object OddNumbers1to15 {
  def main(args: Array[String]):Unit={
    //7) Print odd numbers from 1 to 15 using "while" loop
    var i=1
    while(i<=15){
      if(i%2!=0){
        print(i+" ")
      }
      i=i+1
    }
  }

}
