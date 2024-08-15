object eligibilityStudentDiscFreeTrial {

    def main(args: Array[String]): Unit = {

      val age = 22

      val wantsFreeTrial = "yes"

      // Check for student discount eligibility
      if (age < 25 || wantsFreeTrial == "yes") {
        println("You are eligible for a student discount or a free trial.")
      } else {
        println("You are not eligible for a student discount or a free trial.")
      }
    }
}
