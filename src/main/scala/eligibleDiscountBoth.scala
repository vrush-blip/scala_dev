object eligibleDiscountBoth {
    def main(args: Array[String]): Unit = {

      val age = 70

      if (age > 60 && age < 25) {
        println("You are eligible for both senior citizen and student discounts.")
      } else if (age > 60) {
        println("You are eligible for a senior citizen discount.")
      } else if (age < 25) {
        println("You are eligible for a student discount.")
      } else {
        println("You are not eligible for either discount.")
      }
    }
}
