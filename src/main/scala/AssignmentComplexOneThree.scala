import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{col, when}

object AssignmentComplexOneThree {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
    conf.set("spark.Appname", "sparkprogram")
    conf.set("spark.master", "local[*]")

    val spark = SparkSession.builder()
      .config(conf)
      .getOrCreate()

    import spark.implicits._

    val documents = List(
      (1, "The quick brown fox"),
      (2, "Lorem ipsum dolor sit amet"),
      (3, "Spark is a unified analytics engine")
    ).toDF("doc_id", "content")

    documents.withColumn("content_category", when(col("content").contains("fox"), "Animal Related")
      .when(col("content").contains("Lorem"), "Placeholder Text")
    .when(col("content").contains("Spark"), "Tech Related")).show(false)

    scala.io.StdIn.readLine()
  }
}
