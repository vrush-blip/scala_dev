object divisibilityFiveNine {
  def main(args: Array[String]): Unit = {
    val fiveNineCheck = 45

    if(fiveNineCheck % 5 == 0){
      println("Number Is Divisible By 5")
    }
    else if(fiveNineCheck % 9 == 0){
      println("Number Is Divisible By 9")
    }
    else{
      println("Number Is Not Divisible By 5 And 9")
    }
  }

}
