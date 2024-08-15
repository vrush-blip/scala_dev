object eligibilityDiscountMembership {
    def main(args: Array[String]): Unit = {

      val purchaseAmount = 180

      val hasLoyaltyCard = "yes"
      // Check for discount eligibility
      if (purchaseAmount > 200) {
        println("You are eligible for a discount.")
      } else {
        println("You are not eligible for a discount.")
      }

      // Check for membership benefits eligibility
      if (hasLoyaltyCard == "yes") {
        println("You qualify for membership benefits.")
      } else {
        println("You do not qualify for membership benefits.")
      }
    }
}
