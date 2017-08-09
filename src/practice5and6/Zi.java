package practice5and6;

/**
 * Created by Fengli on 2017/8/4.
 */
public class Zi extends  Fu {

    public  Zi(){
        //super（）必须要放在函数中的第一行
        //当父类有多个构造方法时，子类只能调用其中一个构造方法，默认调用的是父类无参构造方法（super()）
      // super();//默认调用父类无参构造方法（super()）,super(xxx,xxx)为父类有参构造方法
       // super(3);//调用父类有参构造方法
        System.out.println("zi");

    }
        int num2=5;
    public  int show(){
        return super.test;//super代表父类对象的引用，this代表子类对象的引用
    }
    public void shows(){

        System.out.println(super.test);//重写（覆盖）
    }

}
