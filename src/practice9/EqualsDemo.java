package practice9;

public class EqualsDemo {

    public  static  void  main(String[] args){

         /* Demo demo1=new Demo();
          Demo demo2=new Demo();
         //比较的是内存地址
          System.out.println(demo1.equals(demo2));
          System.out.println(demo1==demo2);*/

       /* Demo demo1=new Demo(5);
        Demo demo2=new Demo(8);
        System.out.println(demo1.Comper(demo2));//false*/
        /*Demo demo1=new Demo(5);
        Demo demo2=new Demo(8);
        System.out.println(demo1.equals(demo2));//false*/
        Demo demo1=new Demo(5);
        //System.out.println(demo1.toString());//practice9.Demo@4554617c(类名@哈希值)
        //System.out.println(demo1.hashCode());//1163157884
        //System.out.println(Integer.toHexString(demo1.hashCode()));//转化为十六进制，4554617c
        System.out.println(demo1.getClass());//class practice9.Demo
        System.out.println(demo1.getClass().getName());//practice9.Demo
    }
}
