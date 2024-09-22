import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{col, month, when}

object AssignmentComplexOneNine {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
    conf.set("spark.Appname", "sparkprogram")
    conf.set("spark.master", "local[*]")

    val spark = SparkSession.builder()
      .config(conf)
      .getOrCreate()

    import spark.implicits._

    val payments = List(
      (1, "2024-07-15"),
      (2, "2024-12-25"),
      (3, "2024-11-01")
    ).toDF("payment_id", "payment_date")

    payments.withColumn("quarter",
      when(month(col("payment_date")).isin("1","2","3"),"Q1")
        .when(month(col("payment_date")).isin("4","5","6"), "Q2")
        .when(month(col("payment_date")).isin("7","8","9"), "Q3")
        .otherwise("Q4"))
        .show()
  }
}
