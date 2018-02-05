package ReflectionPractice.practice2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 2/3/2018
 * Time: 5:33 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
public class test {

     private  static  void  showMethods(){

         Student student=new Student("Tony",22);
         // 获取所有public方法(包括Student本身的和从父类继承来的）
         Method[] methods=student.getClass().getMethods();
         try {
             //注意，通过 getMethod只能获取public方法，若尝试获取private方法则会抛出异常
             Method learnMethod=student.getClass().getMethod("study", String.class, String.class);
             learnMethod.setAccessible(true);
             learnMethod.invoke(student,student.getName(),"Spring boot");
         }catch (Exception e){
             e.printStackTrace();
         }
     }

     private  static  void  showDeclaredFields(){
         Student student=new Student("Crawford",25,60);
         //获取当前类中定义的全部属性（不包括从父类继承过来的）
         Field[] fields=student.getClass().getDeclaredFields();
         try {
             // 获取指定的属性
             Field field=student.getClass().getDeclaredField("grade");
             field.setAccessible(true);
             //获取属性值
             System.out.println("当前grade的值为"+field.getInt(student));
             //设置属性值
            // field.setInt(student,100);
             field.set(student,100);
             System.out.println("当前grade的最新值为"+field.getInt(student));
         }catch (Exception ex){
             ex.printStackTrace();
         }
     }

     private  static  void showFields(){
         Student student=new Student("FengZhi",30,100,1);
         // 获取当前类和父类的所有public属性
          Field[] publicFields=student.getClass().getFields();
          try {
               Field field=student.getClass().getField("count");
               field.setAccessible(true);//取消 Java 语言访问检查
               System.out.println("filed"+"is public:"+ Modifier.isPublic(field.getModifiers()));
               System.out.println("field'current value is"+field.getInt(student));
               field.setInt(student,20);
              System.out.println("field'newest value is"+field.getInt(student));
          }catch (Exception ex){
              ex.printStackTrace();
          }
     }



    public  static  void main(String[] args) throws Exception{

        Class<People> peopleClass = People.class;
        Class<People> peopleClass1= (Class<People>) Class.forName("ReflectionPractice.practice2.People");
        People people=new People("Bill",18);
        Class<People> peopleClass2= (Class<People>) people.getClass();
        //通过反射获取类的构造器
        try{
            Constructor<People> constructor=peopleClass.getConstructor(String.class,int.class);
            constructor.setAccessible(true);//取消 Java 语言访问检查
            People people3=constructor.newInstance("Bill",18);
            people3.speak();
        }catch (Exception e){

            e.printStackTrace();
        }
        //通过反射获取类中声明的方法，获取当前类中声明的方法（不包括从父类继承来的）
        Student student=new Student(
"Bill",18);
        //获取Student类声明的所有方法
        Method[] methods=student.getClass().getDeclaredMethods();
            try{
            //获取learnMethod对象（封装了learn方法）
            Method learnMethod=student.getClass().getDeclaredMethod("learn",String.class,String.class);
            learnMethod.setAccessible(true);//取消 Java 语言访问检查
            //获取learn方法的参数列表并打印出来
            Class<?>[] paramClasses = learnMethod.getParameterTypes() ;
         /*   for (Class<?> class : paramClasses) {
                System.out.println("learn方法的参数: " + class.getName());
            }*/
            //判断learn方法是否为private
            System.out.println(learnMethod.getName()+"is private："+ Modifier.isPrivate(learnMethod.getModifiers()));
            //调用learn方法
            learnMethod.invoke(student,student.getName(),"Java Reflection");


        }catch (Exception e){

            e.printStackTrace();
        }

        //获取当前类和父类中声明的公有方法
        showMethods();
        //通过反射获取类中定义的属性
        //获取当前类中定义的属性（不包括从父类继承来的属性）
        showDeclaredFields();

        //获取当前类和父类中定义的public属性
        showFields();
        //通过反射获取类的父类及类所实现的接口
        Student student1 = new Student("james", 33);
        Class<?> superClass=student.getClass().getSuperclass();
        System.out.println("Student父类的名字为："+superClass.getName());
        Class<?>[] interfaces=student.getClass().getInterfaces();
    }

}