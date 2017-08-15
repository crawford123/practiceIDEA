package practice14;

/**
 *
 * 单例模式，懒汉式
 *
 */
public class SingleDemo1 {

    private  static   SingleDemo1 s=null;

    //使构造函数私有化，限制只能创造一个实例
      private  SingleDemo1(){



      }
   /* public  static  SingleDemo1 getInstance(){

        if(s==null){

            s=new SingleDemo1();//初始化
        }
         return  s;
    }*/

   /*
    同步函数的锁是this,静态同步函数的锁是类名.class,
   静态同步的方法，使用的锁是该字节码文件对象 类名.class*/

   //这样其实是比较麻烦的，我们用饿汉式比较多，懒汉式作用是延时加载，多线成访问就会有安全问题
   public static  SingleDemo1 getInstance(){

       if(s==null){
           synchronized(SingleDemo1.class) {
               if (s==null){


                   s=new SingleDemo1();
               }


           }

       }
       return s;
   }
}
