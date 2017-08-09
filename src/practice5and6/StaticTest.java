package practice5and6;

/**
 * Created by Fengli on 2017/8/4.
 */
public class StaticTest {
    //限制性静态代码块，再执行主函数
    static {

        System.err.println("b");
    }
    public static void main(String[] str) {

        new StaticDemo();//调用StaticDemo类的构造函数
        System.err.println("over");
    }
    static {
       //静态代码块
        System.err.println("c");
    }

}
