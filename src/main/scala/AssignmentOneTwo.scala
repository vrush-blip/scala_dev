import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{col, when}

object AssignmentOneTwo {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
    conf.set("spark.Appname", "sparkprogram")
    conf.set("spark.master", "local[*]")

    val spark = SparkSession.builder()
      .config(conf)
      .getOrCreate()

    import spark.implicits._

    val grades = List(
      (1, 85),
      (2, 42),
      (3, 73)
    ).toDF("student_id", "score")

    grades.withColumn("grade",when(col("score") >= 50,"Pass").otherwise("Fail")).show()
  }

}
