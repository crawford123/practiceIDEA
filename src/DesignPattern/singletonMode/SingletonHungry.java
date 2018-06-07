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

//饿汉式单例模式
public class SingletonHungry {


    private  static  SingletonHungry singletonHungry=new SingletonHungry();


    private   SingletonHungry(){

    }

    public  static SingletonHungry getInstance(){

            return  singletonHungry;

    }
}
