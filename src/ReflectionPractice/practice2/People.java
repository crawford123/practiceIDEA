package ReflectionPractice.practice2;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 2/3/2018
 * Time: 5:10 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
public class People {

    private String name;
    private int age;

    public  People(String name,int age){

        this.name=name;
        this.age=age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void speak(){

        System.out.println(getName()+":"+getAge());
    }


}
