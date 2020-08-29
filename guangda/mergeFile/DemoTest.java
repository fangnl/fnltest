package com.guangda.mergeFile;

import com.guangda.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoTest {

       static Logger logger = LoggerFactory.getLogger("merge-dev");


    public static void main(String[] args) throws Exception {
//
//        logger.error("123","ssss");
//
//        logger.info("什么鬼");
        System.setProperty("HADOOP_USER_NAME", "root");

//        logger.info("hello word");
//        logger.info("hello word");
//        logger.error("hello word");
       // MergeFilePath mergeFilePath = new MergeFilePath();
        //List<String> patternFile = mergeFilePath.getPatternFile("/textoneG");
        //System.out.println(patternFile);
//        System.setProperty("HADOOP_USER_NAME", "root");
//        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
//        map.put("/textoneG", "/megerlittlefile2/test01");
//        map.put("/megerlittlefile/i*", "/megerlittlefile2/test02");
     //   int i =12;
       // logger.info("输入{}{}",i,19);

       // ThreadPoolExecutor threadPool = new ThreadPoolExecutor(5, 5, 3, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
        //
       MergeUtil.merge("/textoneG","/megerlittlefile2/test09");

     //  MergeUtil.close();
        //
       // MergeUtil.merge("","");

//        String s="indesh.sh";
//        System.out.println(s.indexOf(".sh"));
//        StringBuffer stringBuffer = new StringBuffer(s);
//        StringBuffer insert = stringBuffer.insert(s.indexOf(".sh"), 0);
//        System.out.println(insert.toString());


        //  ExecutorService threadPool = Executors.newFixedThreadPool(2);
//        Set<String> keys = map.keySet();
        //  System.out.println("活动的线程1"+threadPool.getActiveCount());
//
//        for (String key : keys) {
//            System.out.println(key);
//            threadPool.execute(() -> {
//                try {
//                    MergeFilePath mergeFilePath = new MergeFilePath();
//                 //   mergeFilePath.merge(key, map.get(key));
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            });
//        }
//
//        String s="123455";
//        String value = PropertiesUtil.getValue("hdfs.file.intPutPath");
//        String[] split = value.split(",");
//        if(split.length<=0|| StringUtils.isEmpty(value))
//            System.out.println("null");

        // System.out.println("value"+value);
//        String[] split = s.split(",");
//        System.out.println(Arrays.toString(split));
//
//        System.out.println("已经完成的任务" + threadPool.getCompletedTaskCount());
//        //关闭线程池
//        threadPool.shutdown();


        //  System.out.println(map);

        //threadPool.
//        for (){
//
//            threadPool.execute(
//                    () -> {
//                        try {
//                            MergeUtil.merge("/textoneG", "/megerlittlefile2/test23");
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                        }
//                    });
//        }


//        new ThreadPoolExecutor(5,7,30, TimeUnit.SECONDS,)

//


//        String value = PropertiesUtil.getValue("shell.spark.submit.command");
//        System.out.println(value);
//        SSH2Util ssh2Util = new SSH2Util("node4", "root", "123456", 22);
//        //上传脚本文件
//        ssh2Util.putFile("echo hello word", "/root/test01.sh");
//        ssh2Util.runCommand("sh  /root/test01.sh"  );
//        ssh2Util.close();

//           SparkMerge sparkMerge = new SparkMerge();
//         String path="hdfs://node2:8020/megerlittlefile/install.log,hdfs://node2:8020/megerlittlefile/install.log2,hdfs://node2:8020/megerlittlefile/install.log3";
//        sparkMerge.merge(path,"/megerlittlefile2/test16");
//        HadoopFileMerge fileMerge = new HadoopFileMerge();
//        String allFilePath = fileMerge.getAllFilePath(args[0]);
//        Long fileLength = fileMerge.getFileLength();
//        System.out.println(allFilePath);

//        if (fileLength < Integer.parseInt(PropertiesUtil.getValue("spark.merge.size"))) {
//            ShellUtil.createShell("/root/shell", "java -classpath /root/guangdaDemo-1.0-SNAPSHOT-jar-with-dependencies.jar  com.guangda.mergeFile.DemoTest01  \"/megerlittlefile/i*\" \"/megerlittlefile2/text13\"");
//        } else {
//            ShellUtil.createShell(
//                    "/root/shell",
//                    "cd /opt/spark-2.3.1/bin/",
//                    "./spark-submit --master yarn-cluster --class com.guangda.mergeFile.DemoTest01 /root/guangdaDemo-1.0-SNAPSHOT-jar-with-dependencies.jar  \"/textoneG\"  \"/megerlittlefile2/text15\""
//            );
//        }

//        //执行shell脚本
//        ShellUtil.runShell("/root/shell");
//        System.out.println("执行了shell");

    }
}
