import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{col, when}

object AssignmentOneOne {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
    conf.set("spark.Appname", "sparkprogram")
    conf.set("spark.master", "local[*]")

    val spark = SparkSession.builder()
      .config(conf)
      .getOrCreate()

    import spark.implicits._

    val employees = List(
      (1, "John", 28),
      (2, "Jane", 35),
      (3, "Doe", 22)
    ).toDF("id", "name", "age")

    employees.withColumn("is_adult", when(col("age") >= 18, "true").otherwise("false")).show()
  }
}
