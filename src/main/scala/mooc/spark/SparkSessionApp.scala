package mooc.spark

import org.apache.spark.sql.SparkSession

object SparkSessionApp {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder()
      .appName("SparkSessionApp")
      .master("local[2]")
      .getOrCreate()

    val people = spark.read.json("file:///Users/air/IT/code/tmp/people.json")

    people.show()
    spark.stop()
  }

}
