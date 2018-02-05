package DynamicProxyPractice.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 2/5/2018
 * Time: 4:28 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
public class DynamicProxy  implements InvocationHandler{
    private  Object obj;//obi为委托类对象
    public  DynamicProxy(Object obj){
         this.obj=obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object result=method.invoke(obj,args);//依次调用委托类的每个方法
        System.out.println("after");
        return result;
    }
}
