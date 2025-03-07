object Pattern2 {
  def main(args: Array[String]):Unit={
    /* Print the pattern
    1
    22
    333
    4444
     */
    for(i<- 1 to 4 by 1){
      for(j<-1 to i by 1){
        print(i)
      }
      println()
    }

  }
}
