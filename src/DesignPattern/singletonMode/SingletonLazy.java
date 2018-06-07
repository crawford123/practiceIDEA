package DesignPattern.singletonMode;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 2/5/2018
 * Time: 9:49 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
//懒汉式单例模式
public class SingletonLazy {

    private  static SingletonLazy singletonLazy;

    private  SingletonLazy(){

    }

    //获取实例时更安全
    public   static synchronized  SingletonLazy  getIntance(){

        if(singletonLazy==null)
        {
            singletonLazy=new SingletonLazy();

        }
        return singletonLazy;
    }

}
