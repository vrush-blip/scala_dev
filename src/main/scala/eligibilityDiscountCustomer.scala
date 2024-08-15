object eligibilityDiscountCustomer {
  def main(args: Array[String]): Unit = {

      val age = 70

      val isNewCustomer = "no"

      // Check if the person is eligible for the senior citizen discount
      if (age > 65 && isNewCustomer == "no") {
        println("You are eligible for the senior citizen discount.")
      } else {
        println("You are not eligible for the senior citizen discount.")
      }
    }
}
