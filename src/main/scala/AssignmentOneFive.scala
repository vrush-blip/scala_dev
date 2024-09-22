import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{col, when}

object AssignmentOneFive {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
    conf.set("spark.Appname", "sparkprogram")
    conf.set("spark.master", "local[*]")

    val spark = SparkSession.builder()
      .config(conf)
      .getOrCreate()

    import spark.implicits._

    val events = List(
      (1, "2024-07-27"),
      (2, "2024-12-25"),
      (3, "2025-01-01")
    ).toDF("event_id", "date")

    events.withColumn("is_holiday",when(col("date").equalTo("2024-12-25") || col("date").equalTo("2025-01-01"),"true").otherwise("false")).show()

  }

}
