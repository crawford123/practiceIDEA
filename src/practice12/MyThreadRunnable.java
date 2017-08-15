package practice12;

public class MyThreadRunnable implements Runnable {

           private int  tick=100;

           public void run(){

                  while(true){
                         if(tick>0){

                           System.out.println("卖票："+tick--);

                         }

                  }


           }
}
