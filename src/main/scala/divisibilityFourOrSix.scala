object divisibilityFourOrSix {
    def isDivisibleBy4Or6(num: Int): Boolean = {
      num % 4 == 0 || num % 6 == 0
    }

    def main(args: Array[String]): Unit = {

      val number = 24

      if (isDivisibleBy4Or6(number)) {
        println(s"$number is divisible by either 4 or 6.")
      } else {
        println(s"$number is not divisible by either 4 or 6.")
      }
    }
}
