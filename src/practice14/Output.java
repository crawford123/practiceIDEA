package practice14;

public class Output  implements  Runnable{
     private  Res res;
    public  Output(Res res){

        this.res=res;
    }


    @Override
    //多线程等待唤醒机制,我们不需要多线成高速消耗CPU，而是在适当的时候唤醒他，所以我们需要定义一个布尔值
    public void run() {

        while (true){
            //循环交替输出，但存在了安全隐患(使用synchronized则使用同步，去除安全隐患)
            synchronized (Input.class) {
                if(!res.flag){

                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }else {
                    System.out.println(res.name + "...." + res.sex);
                    res.flag=false;
                    notify();

                }

            }
        }
    }
}
