package practice4;

/**
 * Created by Fengli on 2017/8/1.
 * 汽车类
 *
 * @author  paul
 */
public class Car {

//构造代码块，给所有对象进行统一初始化，优先于构造方法
    {

        System.out.println("我是构造方法");
        System.out.println("我爱你");
    }
    //颜色
     String  color="红色";

     //轮胎个数
     int num=4;



     //行为
    void run(){
        System.out.println("我是"+color+"的小汽车，我有"+num+"个轮子");


    }
}
