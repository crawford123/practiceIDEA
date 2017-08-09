package practice4;

/**
 * Created by Fengli on 2017/8/1.
 */
public class TestCar {

       public static void main(String[]  str){
             Car car=new Car();
             //输出颜色
              System.out.println(car.color+"的小汽车");
           // 输出轮胎个数
              System.out.println(car.num+"的小汽车");
           // 输出行为
              car.run();

       }
}
