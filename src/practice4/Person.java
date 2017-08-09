package practice4;

/**
 * Created by Fengli on 2017/8/1.
 */
public class Person {
    //私有
    private  int age;
    // 构造方法
    public  Person(){

        System.out.println("我是构造方法");
    }
    // 构造方法
    public  Person(String str){
        System.out.println(str);

    }
    public  Person(String str,int age){
        System.out.println("我是构造方法"+age);

    }
    // 构造方法
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // 说话方法
    void speak() {
        System.out.println("我今年" + age + "岁");
    }
}
