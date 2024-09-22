import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{col, hour, to_timestamp, when}

object AssignmentMediumOneFive {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
    conf.set("spark.Appname", "sparkprogram")
    conf.set("spark.master", "local[*]")

    val spark = SparkSession.builder()
      .config(conf)
      .getOrCreate()

    import spark.implicits._

    val logins = List(
      (1, "09:00"),
      (2, "18:30"),
      (3, "14:00")
    ).toDF("login_id", "login_time")

    logins.withColumn(
      "is_morning",
      hour(to_timestamp($"login_time", "HH:mm")) < 12
    ).show()

    scala.io.StdIn.readLine()
  }
}
