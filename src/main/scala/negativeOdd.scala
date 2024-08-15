object negativeOdd {
  def main(args: Array[String]): Unit = {
    val negOddRangeCheck = -8

    if (negOddRangeCheck < 0) {
      if (negOddRangeCheck % 2 != 0) {
        println("Number is negative and odd")
      } else {
        println("Number is negative but not odd")
      }
    } else {
      println("Number is not negative")
    }
  }
}

