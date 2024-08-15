object rangeCheck {
  def main(args:Array[String]):Unit= {
    var rangeCheck = -15

    if(rangeCheck < -10 || rangeCheck > 10)
      {
        println("Given Value Is Either Less Than -10 Or Greater Than 10")
      }
      else{
        println("Given Value Is None")
      }
  }
}
