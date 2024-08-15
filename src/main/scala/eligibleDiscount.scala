object eligibleDiscount {
  def main(args: Array[String]): Unit = {
    val eligibleDiscCheck = 63

    if(eligibleDiscCheck > 60){
      println("Eligible For Senior Citizen Discount")
    }
    else if(eligibleDiscCheck < 25){
      println("Eligible For Student Discount")
    }
    else{
      println("Eligible For No Discount")
    }
  }
}
