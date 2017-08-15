package practice14;

public class Input  implements  Runnable{


     private Res res;
    public  Input(Res res){

         this.res=res;
    }


    //多线程等待唤醒机制,我们不需要多线成高速消耗CPU，而是在适当的时候唤醒他，所以我们需要定义一个布尔值
    @Override
    public void run() {
        int x = 0;

        while (true) {
            //使用synchronized则使用同步，去除安全隐患
            synchronized (Input.class) {
                if(res.flag){

                    try {
                        //等待线程都存放在线程池
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                if (x == 0){
                    res.name = "Crawford";
                    res.sex = "男";

                } else if (x == 1){
                    res.name = "Amy";
                    res.sex = "女";

                }
                //循环交替输出
                x = (x + 1) % 2;
                res.flag=true;
                //通知
                notify();

            }
        }

    }
}
