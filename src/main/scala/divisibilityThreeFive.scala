object divisibilityThreeFive {
  def isDivisibleBy3And5(num: Int): Boolean = {
      num % 3 == 0 && num % 5 == 0
    }

    def main(args: Array[String]): Unit = {

      val number = 15

      if (isDivisibleBy3And5(number)) {
        println(s"$number is divisible by both 3 and 5.")
      } else {
        println(s"$number is not divisible by both 3 and 5.")
      }
    }
}
