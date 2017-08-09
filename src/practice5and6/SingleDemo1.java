package practice5and6;

/**
 * Created by Fengli on 2017/8/4.
 */
/**
 * 单例模式
 * 懒汉式
 *
 *
 */
public class SingleDemo1 {
      private static  SingleDemo1 s=null;
       public  SingleDemo1(){


       }

       public  static SingleDemo1 getInstance(){

              if(s==null){
                   s=new SingleDemo1();
              }
              return s;

       }

}
