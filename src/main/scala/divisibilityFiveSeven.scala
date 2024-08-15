object divisibilityFiveSeven {
  def main(args: Array[String]): Unit = {
    val fiveSevenCheck = 35

    if (fiveSevenCheck % 5 == 0) {
      if (fiveSevenCheck % 7 == 0) {
        println("Number is divisible by both")
      } else {
        println("Number is divisible only by 5")
      }
    } else {
      println("Number is not divisible by 5 and 7")
    }

  }

}
