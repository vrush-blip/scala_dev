import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{datediff, when}

object AssignmentComplexOneFour {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
    conf.set("spark.Appname", "sparkprogram")
    conf.set("spark.master", "local[*]")

    val spark = SparkSession.builder()
      .config(conf)
      .getOrCreate()

    import spark.implicits._

    val tasks = List(
      (1, "2024-07-01", "2024-07-10"),
      (2, "2024-08-01", "2024-08-15"),
      (3, "2024-09-01", "2024-09-05")
    ).toDF("task_id", "start_date", "end_date")

    tasks.withColumn("task_duration",
      when(datediff($"end_date", $"start_date") <= 7, "Short")
        .when(datediff($"end_date", $"start_date").between(7, 14), "Medium")
        .otherwise("Long")).show()
  }
}
