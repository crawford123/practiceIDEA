package practice7;

public abstract class AbstractGetTime {
    //获取时间
      public  void getTime(){

           long start=System.currentTimeMillis();
            runcode();
            long end=System.currentTimeMillis();
            System.out.println("总共耗时："+(end-start));

      }
      //耗时方法
      public  abstract  void runcode();
}
