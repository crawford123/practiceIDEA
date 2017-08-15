package practice12;

/**
 *
 * 1.继承Thread 类
 2.复写Thread类的run方法
 3.调用线程的start方法
      该方法有两个作用，启动线程和调用run方法
 */
public class MyThread  extends  Thread{


       public MyThread(String name){

            super(name);//调用父类的setName()方法

       }


        public  void run(){
            System.out.println("线程姓名："+Thread.currentThread());//它还可以通过Thread.currentThread()来获取对象名称，它等同于this.getName();
            System.out.println(this.getName());//线程都是有名称的，通过格式Thread-编号来区分，结果：Thread-0
/*

              for(int i=0;i<1140;i++){

                    System.out.println("我是一个线程");
              }
*/


        }
}
