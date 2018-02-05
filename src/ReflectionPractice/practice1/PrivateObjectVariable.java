package ReflectionPractice.practice1;

import java.lang.reflect.Field;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 2/1/2018
 * Time: 9:07 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
//访问私有变量
public class PrivateObjectVariable {

    private String privateString=null;
    public PrivateObjectVariable(String privateString){

        this.privateString=privateString;
    }

    public static void  main(String[] args) throws Exception {

        PrivateObjectVariable privateObject=new PrivateObjectVariable("The Private Value");
        Field privateStringField = PrivateObjectVariable.class.getDeclaredField("privateString");
        privateStringField.setAccessible(true);
        String fieldValue=(String)privateStringField.get(privateObject);
        System.out.println("fieldValue="+fieldValue);

    }
}
