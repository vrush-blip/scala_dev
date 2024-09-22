import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{col, when}

object AssignmentComplexOneTwo {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
    conf.set("spark.Appname", "sparkprogram")
    conf.set("spark.master", "local[*]")

    val spark = SparkSession.builder()
      .config(conf)
      .getOrCreate()

    import spark.implicits._

    val reviews = List(
      (1, 1),
      (2, 4),
      (3, 5)
    ).toDF("review_id", "rating")

    reviews.withColumn("feedback",
        when(col("rating") < 3, "Bad").when(col("rating").isin(3, 4), "Good")
          .when(col("rating").equalTo(5), "Excellent"))
      .withColumn("is_positive",
        when(col("rating") >= 3, "true").otherwise("false")).show()

    scala.io.StdIn.readLine()
  }
}
