object oddDivisible {
  def main(args:Array[String]):Unit= {
    val oddCheck = 27

    if(oddCheck % 2 != 0 && oddCheck % 3 != 0)
      {
        println("Given Number Is Odd And Not Divisible By 3")
      }
      else{
        println("Given Number Is Odd")
      }
  }

}
