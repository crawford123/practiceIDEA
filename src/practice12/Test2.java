package practice12;

public class Test2 {


    public static  void main(String[] args){
              /*使用实现Runnable接口的方式*/
             MyThreadRunnable myThreadRunnable=new MyThreadRunnable();
             Thread thread1=new Thread(myThreadRunnable);
             Thread thread2=new Thread(myThreadRunnable);
             Thread thread3=new Thread(myThreadRunnable);
             Thread thread4=new Thread(myThreadRunnable);
             thread1.start();
             thread2.start();
             thread3.start();
             thread4.start();

    }
}
