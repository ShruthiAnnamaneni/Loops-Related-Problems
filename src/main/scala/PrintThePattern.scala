object PrintThePattern {
  def main(args: Array[String]):Unit={
    /* Print the pattern
    *
    **
    ***
    ****
     */
    for(i<- 1 to 4 by 1){
      for(j<-1 to i by 1){
        print("*")
      }
      println()
    }
  }

}
