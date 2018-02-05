package ReflectionPractice.practice1;

import java.lang.reflect.Method;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 2/1/2018
 * Time: 9:19 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
public class PrivateObjectMethod {

    private String privateString=null;

    public PrivateObjectMethod(String privateString){

        this.privateString=privateString;
    }

    public static void  main(String[] args) throws Exception {

        PrivateObjectMethod  privateObjectMethod=new PrivateObjectMethod("The Private Value");
        Method privateStringMethod=PrivateObjectMethod.class.getDeclaredMethod("getPrivateString",null);
        //调用setAccessible()方法会关闭指定类的Method实例的反射访问检查
        privateStringMethod.setAccessible(true);
        String returnValue=(String)privateStringMethod.invoke(privateObjectMethod,null);
        System.out.println("returnValue:"+returnValue);

    }

    private String getPrivateString(){
        return  this.privateString;
    }

}
