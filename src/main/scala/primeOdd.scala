object primeOdd {
  def isPrime(num: Int): Boolean = {
    if (num <= 1) return false
    if (num == 2) return true
    if (num % 2 == 0) return false

    for (i <- 3 to Math.sqrt(num).toInt by 2) {
      if (num % i == 0) return false
    }
    true
  }

  def main(args: Array[String]): Unit = {
    val primeOddCheck = 17

    if (isPrime(primeOddCheck)) {
      if (primeOddCheck % 2 != 0) {
        println(s"$primeOddCheck is both prime and odd.")
      } else {
        println(s"$primeOddCheck is prime but not odd.")
      }
    } else {
      println(s"$primeOddCheck is not prime.")
    }
  }
}