package practice14;

public class test {
    public  static  void  main(String[] args){
        /**
         * 线程间通讯
         */
           Res res=new Res();
           Input input=new Input(res);
           Output output=new Output(res);
           Thread thread1=new Thread(input);
           Thread thread2=new Thread(output);
           thread1.start();
           thread2.start();

    }
}
