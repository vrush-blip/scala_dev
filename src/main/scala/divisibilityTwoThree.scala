object divisibilityTwoThree {
  def isDivisibleBy2Or3(num: Int): Boolean = {
      num % 2 == 0 || num % 3 == 0
    }

    def main(args: Array[String]): Unit = {

      val number = 9

      if (isDivisibleBy2Or3(number)) {
        println(s"$number is divisible by either 2 or 3.")
      } else {
        println(s"$number is not divisible by either 2 or 3.")
      }
    }


}
