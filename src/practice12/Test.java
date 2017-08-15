package practice12;

public class Test {

    public static  void main(String[] args){

      /*  MyThread thread=new MyThread();
        thread.start();*/
       /* for(int i=0;i<1140;i++){

            System.out.println("测试多进程");//交替输出，两个线程同时在跑,都在获取cpu的使用权
        }*/
      /*  MyThread thread=new MyThread("最帅的进程");//结果：线程姓名：Thread[最帅的进程,5,main]
        thread.start();*/
        /**
         * 需求：简单的卖票程序，多个线程同时卖票 使用继承Thread的方式
         */
      SellTicketThread sellTicketThread1=new SellTicketThread();
      SellTicketThread sellTicketThread2=new SellTicketThread();
      SellTicketThread sellTicketThread3=new SellTicketThread();
      SellTicketThread sellTicketThread4=new SellTicketThread();
        sellTicketThread1.start();
        sellTicketThread2.start();
        sellTicketThread3.start();
        sellTicketThread4.start();
    }
}
