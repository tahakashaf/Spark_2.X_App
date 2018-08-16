/**
  * Created by NAQVI on 8/17/2018.
  */
import org.apache.spark.{SparkConf, SparkContext}

object LearnSpark {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
    conf.setAppName("Spark Test")
    conf.setMaster("local[4]")
    val sc = new SparkContext(conf)
    //System.in.read
    println(sc)
  }

}
