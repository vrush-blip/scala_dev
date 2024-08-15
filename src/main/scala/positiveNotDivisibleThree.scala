object positiveNotDivisibleThree {
  def main(args: Array[String]): Unit = {

    val number = 7

    if (number > 0 && number % 3 != 0) {
      println(s"$number is positive and not divisible by 3.")
    } else {
      println(s"$number does not meet the criteria (either not positive or divisible by 3).")
    }
  }
}
