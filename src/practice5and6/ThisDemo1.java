package practice5and6;

/**
 * Created by Fengli on 2017/8/4.
 */
public class ThisDemo1 {

    public  static  void  main(String[] args){
        /**
         * 需求：给人定义一个用于比较年龄相同的功能，也就是是否是同龄人
         */
        Person p1=new Person(20);
        Person p2=new Person(25);
        boolean b=p1.compare(p2);
        System.out.println(b);
        // 构造函数间只能用this语句
        Person p3=new Person(10,"吴芳");
        System.out.println("姓名:"+p3.getName()+"年龄"+p3.getAge());
        System.out.println("类名："+p3.getClass());
    }
}
