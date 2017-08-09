package practice1;

/**
 * Created by Fengli on 2017/7/28.
 */
public class HelloJava {

     public  static  void main(String[] str){

        //输出HelloJava
         System.out.println("HelloJava");
         //定义一个变量,理解变量的概念
         int num=5;
         System.out.println(num);
         num=10;
         System.out.println(num);
        //理解类型转换,原则是以大的为主，强制类型转换
         byte a=2;
         a=(byte) (a+5);//强制类型转换
         System.out.println(a);

     }

}
