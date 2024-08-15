object nonNegaEven {
  def main(args: Array[String]): Unit = {
    val nonNegativeCheck = 8

    if(nonNegativeCheck > 0) {
      println("Number Is Not Non Negative")
      if(nonNegativeCheck % 2 == 0) {
        println("Number Is Even")
      }
      else{
        print("Number Is Not Even")
      }
    }
    else{
      print("Number Is Non Negative")
    }
  }

}
