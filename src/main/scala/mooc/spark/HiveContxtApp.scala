package mooc.spark

import org.apache.spark.sql.hive.HiveContext
import org.apache.spark.{SparkConf, SparkContext}


object HiveContxtApp {

  def main(args: Array[String]){
    // 1)创建相应的Context
    val sparkConf = new SparkConf()

    //在测试或者生产环境中，APPName和Master我们是通过脚本进行指定
    //sparkConf.setAppName("HiveContextApp").setMaster("local[2]")

    val sc = new SparkContext (sparkConf)
    val hiveContext = new HiveContext (sc)

    //2)相关的处理：json

    hiveContext.table ("emp") show ()

    //3)关闭资源
    sc.stop ()
  }
}
