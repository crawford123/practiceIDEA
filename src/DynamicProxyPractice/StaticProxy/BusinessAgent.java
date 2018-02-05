package DynamicProxyPractice.StaticProxy;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 2/5/2018
 * Time: 4:05 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
public class BusinessAgent implements Sell {
    private Vendor vendor;

    public  BusinessAgent(Vendor vendor){

        this.vendor=vendor;
    }
    @Override
    public void sell() {
        //给Vendor类增加一个过滤功能，只卖货给大学生
       /* if(isCollegeStudent()){
            vendor.sell();
        }*/
        System.out.println("before");
        vendor.sell();
        System.out.println("after");
    }

    @Override
    public void ad() {
        System.out.println("before");
          vendor.ad();
        System.out.println("after");
    }
}
