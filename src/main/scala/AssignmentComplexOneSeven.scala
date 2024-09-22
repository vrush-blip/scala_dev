import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{col, when}

object AssignmentComplexOneSeven {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
    conf.set("spark.Appname", "sparkprogram")
    conf.set("spark.master", "local[*]")

    val spark = SparkSession.builder()
      .config(conf)
      .getOrCreate()

    import spark.implicits._

    val scores = List(
      (1, 85, 92),
      (2, 58, 76),
      (3, 72, 64)
    ).toDF("student_id", "math_score", "english_score")


    scores.withColumn("math_grade",
      when(col("math_score") > 80, "A")
    .when(col("math_score").between(60,80), "B")
    .otherwise("C"))
      .withColumn("english_grade",
        when(col("english_score") > 80, "A")
          .when(col("english_score").between(60,80), "B")
          .otherwise("C"))
      .show()



  }


}
