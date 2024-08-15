object multipleThreeSeven {
  def main(args: Array[String]): Unit = {
    val threeSevenCheck = 24

    if(threeSevenCheck % 3 == 0 && threeSevenCheck % 7 == 0){
      println("Multiple Of Both 3 And 7")
    }
    else{
      println("Multiple Of Either Of Them")
    }
  }

}
