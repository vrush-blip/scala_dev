object nonPositiveEven {
  def main(args: Array[String]): Unit = {
    val positiveEvenCheck = -7
    if(positiveEvenCheck < 0)
      {
        if(positiveEvenCheck % 2 == 0){
          println("Number Is Non Positive And Even")
        }
        else
          {
            println("Number Is Not Even But Non Positive")
          }
      }
    else
      {
        println("Number Is Positive")
      }

  }

}
