object divisibilityTwoFive {
  def main(args: Array[String]): Unit = {
    val twoFiveCheck = 25

    if(twoFiveCheck %2 == 0){
    println("Divisible By 2")
    }
    else if(twoFiveCheck % 5 == 0){
      println("Divisible By 5")
    }
  }

}
