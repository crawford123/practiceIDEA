package practice7;

/**
 *
 * 测试程序的运行时间
 */

public class GetTime {
    public  void getTime(){
        long start=System.currentTimeMillis();
        System.out.println("程序开始时间："+start);
         for (int i=0;i<1000;i++){

             System.out.print(" "+i);
         }

         long end=System.currentTimeMillis();
        System.out.println("程序结束时间："+end);
         System.out.println("耗时:"+(end-start));

    }
}
