package practice12;


/**
 * 卖票程序
 *
 * @author paul
 *
 */
public class SellTicketThread extends  Thread {
    //总票数
    private  static  int ticket_num=100;
    public  void  run(){
         while (true){
             if(ticket_num>0)
             {
                 System.out.println(currentThread().getName()+"卖票："+ticket_num--);
                 //currentThread().getName()获取当前线程的姓名
             }


         }


    }
}
