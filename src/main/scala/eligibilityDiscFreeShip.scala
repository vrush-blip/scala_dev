object eligibilityDiscFreeShip {
  def main(args: Array[String]): Unit = {
    val discountFreeCheck = 120

    if(discountFreeCheck > 150){
      println("Eligible For Discount")
    }
    else if(discountFreeCheck > 100 && discountFreeCheck <= 150)
      {
        println("Eligible For Free Shipping")
      }
  }

}
