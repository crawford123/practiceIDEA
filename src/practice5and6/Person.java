package practice5and6;

/**
 * Created by Fengli on 2017/8/4.
 */
public class Person {
    private  int age;
    private  String name;
       public Person(int age){

           this.age=age;

       }
    public  Person(int age,String name){
         this(age); //调用上一个构造函数
         this.name=name;


    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  boolean compare(Person p){

           return this.age==p.age;//比较是否相等，返回布尔值
    }
}
