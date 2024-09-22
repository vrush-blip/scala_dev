import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{col, when}

object AssignmentComplexOneFive {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
    conf.set("spark.Appname", "sparkprogram")
    conf.set("spark.master", "local[*]")

    val spark = SparkSession.builder()
      .config(conf)
      .getOrCreate()

    import spark.implicits._

    val orders = List(
      (1, 5, 100),
      (2, 10, 150),
      (3, 20, 300)
    ).toDF("order_id", "quantity", "total_price")

    orders.withColumn("order_type",
      when(col("quantity") <10 && col("total_price") < 200, "Small & Cheap")
    .when(col("quantity") >=10 && col("total_price") < 200, "Bulk & Discounted")
    .otherwise("Premium Order"))
      .show()
  }

}
