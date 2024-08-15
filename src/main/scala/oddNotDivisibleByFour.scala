object oddNotDivisibleByFour {
  def main(args: Array[String]): Unit = {
    val oddFourCheck = 10

    if(oddFourCheck % 2 != 0)
      {
        if(oddFourCheck % 4 != 0)
          {
            println("Given Number Is Odd And Not Divisible By 4")
          }
        else
          {
            println("Given Number Is Divisible By 4")
          }
      }
    else
      {
        println("Given Number Is Not Odd")
      }
  }

}
