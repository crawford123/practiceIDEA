package practice14;

/**
 *
 * 单例模式，饿汉式
 *
 */

public class SingleDemo {
             private  static  final SingleDemo  s=new SingleDemo();

    //使构造函数私有化，限制只能创造一个实例
             private  SingleDemo(){


             }

             public static  SingleDemo getInstance(){


                 return  s;


             }




}
