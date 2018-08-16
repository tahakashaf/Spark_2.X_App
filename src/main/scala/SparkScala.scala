/**
  * Created by NAQVI on 8/17/2018.
  */
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.log4j.{Level, Logger}
object SparkScala {

  Logger.getLogger("org").setLevel(Level.ERROR)
  //configuration variable can be defined

  def main(args: Array[String]): Unit = {

  val sparkConf = new SparkConf()
  sparkConf.setAppName("Taha's Spark Application")
  //local mode :- 4 specifies the logical cores of the CPU
  sparkConf.setMaster("local[4]")
  val sparkContext = new SparkContext(sparkConf)
  println(sparkContext)
  System.in.read
  }



}
