package ReflectionPractice.practice2;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 2/3/2018
 * Time: 5:13 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
public class Student extends  People{
    public  int count;
    private  int grade;
    public Student(String name, int age) {
        super(name, age);//继承父类的构造方法
    }
    public Student(String name, int age,int grade) {
        super(name, age);
        this.grade=grade;

    }
    public  Student(String name,int age,int grade,int count){
        this(name,age,grade);
        this.count=count;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    private void  learn(String name,String course){
        System.out.println(name+"learn"+course);

    }
    public  void study(String name,String course){
        System.out.println(name+"study"+course);
    }

}
