object eligibilityVotingDriving {
  def main(args:Array[String]):Unit= {
    val eligibilityCheck = 20

    if(eligibilityCheck >= 18){
      println("Person Is Eligible To Vote And Drive")
    }
    else if(eligibilityCheck >= 16){
      println("Person Is Eligible To Drive")
    }
    else{
      print("Person Is Not Eligible")
    }
  }

}
