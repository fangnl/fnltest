package com.guangda.mergeFile;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.lib.CombineTextInputFormat;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class SparkMerge {
    public static void main(String[] args) throws Exception {
        System.setProperty("HADOOP_USER_NAME", "root");
       // System.setProperty("HADOOP_CONF_DIR", "/opt/hadoop-2.6.5/etc/hadoop");
        merge("/megerlittlefile", "");
    }

    public static void merge(String paths, String outPath) throws Exception {

        SparkConf conf = new SparkConf();
        conf.setMaster("yarn");
      //  conf.set("HADOOP_CONF_DIR","/opt/hadoop-2.6.5");
        conf.set("yarn.resourcemanager.hostname", "192.168.163.73");
        conf.set("spark.driver.host", "node4");
       // conf.setJars(new String[]{"/Users/fangnailiang/IdeaProjects/guangdaDemo/target/guangdaDemo-1.0-SNAPSHOT-jar-with-dependencies.jar"});
        // 设置压缩格式
        conf.set("spark.serializer", "org.apache.spark.serializer.KryoSerializer");
        conf.setAppName("merge");
        JavaSparkContext jsc = new JavaSparkContext(conf);

        JavaPairRDD<LongWritable, Text> pairRDD = jsc.hadoopFile(paths, CombineTextInputFormat.class, LongWritable.class, Text.class);
        pairRDD.map(str -> str._2).foreach(str -> System.out.println(str));
        // pairRDD.map(Tuple2::_2).saveAsTextFile(PropertiesUtil.getValue("fs.defaultFS.value") + outPath);
        jsc.close();
    }
}
