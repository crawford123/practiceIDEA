package practice9;

import practice8.AdsDemo;

/**
 *
 * 内部类可以直接访问外部类的成员，包括私有成员
 而外部类要访问内部类中的成员就必须建立内部类的对象
 */
public class Outer {
    private  static  int x=3;
    private  int num=5;

    public void  show(){
        System.out.println("x="+num);
        new Inner().fini();
    }
     public  int getNum(){

        return  0;
     }

    void  finis(){
        class fini{
            void show(){

                System.out.println("内部类");
            }

        }
         new fini().show();

    }

    public  void function(){

         new Inner1().show();
    }

    //匿名内部类的格式：new 父类或者接口（）{定义子类的内容};
     public  void  functions(){
         System.out.println("开始执行代码");
         //带内容的对象
          new AdsDemo(){
              @Override
              //匿名内部类中定义的方法最好不超过三个
              public void show() {
                System.out.println("x:"+num);
              }
          };

     }

    //静态内部类
    static class  Inners{

         void fini(){
             System.out.println("内部类x="+x);//只能访问外部类的静态成员

         }

    }

       //成员内部类
      class Inner{
           int num=4;
          void  fini(){
              int num=3;
            System.out.println("内部类x="+num);//直接访问外部类的私有变量  3
            System.out.println(this.num);//4
            System.out.println(Outer.this.num);//5
           // System.out.println(getNum());//直接访问外部类的方法
        }


    }

    //匿名内部类（正常的逻辑代码）(继承抽象类或实现接口),匿名内部类就是一个匿名子类对象,理解为带内容的对象
    class Inner1 extends AdsDemo {


        @Override
        public void show() {
            System.out.println("method:  "+num);
        }
    }



}
