package practice5and6;

/**
 * Created by Fengli on 2017/8/4.
 */

/**
 * 单例模式
 * 饿汉式(一般会用，安全，简单)
 *
 *
 */
public class SingleDemo {
     private static StaticDemo s=new StaticDemo();//实例化
      public SingleDemo(){

      }
        public   static StaticDemo getInstance(){

            return  s;


      }

}
