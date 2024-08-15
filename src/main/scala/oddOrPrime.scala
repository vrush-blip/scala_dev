object oddOrPrime {
      def isPrime(num: Int): Boolean = {
      if (num <= 1) return false
      if (num == 2) return true
      if (num % 2 == 0) return false

      for (i <- 3 to Math.sqrt(num).toInt by 2) {
        if (num % i == 0) return false
      }
      true
    }

    def isOddOrPrime(num: Int): Boolean = {
      num % 2 != 0 || isPrime(num)
    }

    def main(args: Array[String]): Unit = {

      val number = 11

      if (isOddOrPrime(number)) {
        println(s"$number is either odd or a prime number.")
      } else {
        println(s"$number is neither odd nor a prime number.")
      }
    }
}
