object divisibilityFourSix {
  def main(args:Array[String]):Unit= {
    val divisibleCheck = 18

    if(divisibleCheck % 4 == 0 || divisibleCheck % 6 == 0 )
      {
        println("Number Is Either Divisible By 4 Or 6")
      }
    else
      {
        println("Number Is Not Divisible")
      }
  }


}
