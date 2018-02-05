package DynamicProxyPractice.DynamicProxy;


import java.lang.reflect.Proxy;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 2/5/2018
 * Time: 4:35 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
public class Main {

    public  static  void  main(String[] args){
        DynamicProxy inter=new DynamicProxy(new Vendor());
        //加上这句将会产生一个$Proxy0.class文件，这个文件即为动态生成的代理类文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        //获取代理类实例sell
        Sell sell=(Sell)(Proxy.newProxyInstance(Sell.class.getClassLoader(),new Class[]{Sell.class},inter));//需要强制转换
        sell.sell();
        sell.ad();
    }
}
