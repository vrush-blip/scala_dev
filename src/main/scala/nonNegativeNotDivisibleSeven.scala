object nonNegativeNotDivisibleSeven {
    def main(args: Array[String]): Unit = {

      val number = 14

      // Check if the number is non-negative and not divisible by 7
      if (number >= 0 && number % 7 != 0) {
        println(s"$number is non-negative and not divisible by 7.")
      } else {
        println(s"$number does not meet the criteria (either negative or divisible by 7).")
      }
    }
}
