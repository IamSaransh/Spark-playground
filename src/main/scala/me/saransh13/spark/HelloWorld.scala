package me.saransh13.spark

import org.apache.spark._
import org.apache.log4j._

object HelloWorld {
  def main(args: Array[String]): Unit = {

//    System.setProperty("hadoop.home.dir", "C:/Hadoop/bin")
    Logger.getLogger("org").setLevel(Level.ERROR)

    val sc = new SparkContext("local[*]", "HelloWorld")

    val lines = sc.textFile("data/ml-100k/u.data")

    val numLines = lines.count()

    println("Hello world! The u.data file has " + numLines + " lines.")

    sc.stop()
  }
}
