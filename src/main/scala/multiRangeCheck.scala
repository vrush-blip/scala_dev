object multiRangeCheck {
  def main(args: Array[String]): Unit = {
    val multiRangeCheck = 25

    val listOne = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val listTwo = List(20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30)

    if (listOne.contains(multiRangeCheck)) {
      println("Matching in listOne")
    }

    if (listTwo.contains(multiRangeCheck)) {
      println("Matching in listTwo")
    }
  }
}
