object eligibilityDiscountAndFreeShip {
  def main(args: Array[String]): Unit = {

      val purchaseAmount = 120

      // Check for discount eligibility
      if (purchaseAmount > 150) {
        println("You are eligible for a discount.")
      } else {
        println("You are not eligible for a discount.")
      }

      // Check for free shipping eligibility
      if (purchaseAmount > 100) {
        println("You qualify for free shipping.")
      } else {
        println("You do not qualify for free shipping.")
      }
    }
}
