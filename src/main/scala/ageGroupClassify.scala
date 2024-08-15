object ageGroupClassify {
  def main(args: Array[String]): Unit = {
    val ageGroupCheck = 15

    if(ageGroupCheck < 13)
      {
        println("Child")
      }
    else if (ageGroupCheck > 13 && ageGroupCheck < 19){
      println("Teenager")
    }
    else if(ageGroupCheck >= 20){
      println("Adult")
    }
  }
}
