import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{col, month, when}

object AssignmentMediumOneThree {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
    conf.set("spark.Appname", "sparkprogram")
    conf.set("spark.master", "local[*]")

    val spark = SparkSession.builder()
      .config(conf)
      .getOrCreate()

    import spark.implicits._

    val orders = List(
      (1, "2024-07-01"),
      (2, "2024-12-01"),
      (3, "2024-05-01")
    ).toDF("order_id", "order_date")

    orders.withColumn("season",
      when(month(col("order_date")).isin(6, 7, 8), "Summer")
        .when(month(col("order_date")).isin(12, 1, 2), "Winter")
        .otherwise("Other")).show()
  }
}
