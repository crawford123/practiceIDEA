package DynamicProxyPractice.StaticProxy;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 2/5/2018
 * Time: 4:04 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
public class Vendor  implements Sell{
    @Override
    public void sell() {

       System.out.println("In sell method");
    }

    @Override
    public void ad() {
        System.out.println("ad method");
    }
}
