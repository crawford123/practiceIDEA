package practice8;

public class test {
    public static  void main(String[] args){
        /**
         *
         * 动物：猫，狗
         */

      /*Cat c=new Cat();
      c.eat();
      Dog d=new Dog();
      d.eat();*/
      //调用方法
      //AnimalEat(new Cat());
      //AnimalEat(new Dog());
        //类型提升，向上转型
      /*  Animal a=new Cat();
        a.eat();
        Animal a1=new Dog();
        a1.eat();*/

      //强制将父类的引用转为子类类型
      /* Animal a=new Cat();
       Cat c=(Cat)a;
       c.sleep();*/
       /* AnimalEat(new Cat());
        AnimalEat(new Dog());*/
       /*BigClass bigClass=new BigClass();
       bigClass.sleep();
       bigClass.study();
       SmallClass smallClass=new SmallClass();
       smallClass.sleep();
       smallClass.study();*/
       /*DoStudent doStudent=new DoStudent();
       doStudent.dosome(new SmallClass());
       doStudent.dosome(new BigClass());*/
       /* Fu fu=new Zi();
        System.out.println(fu.num);
        Zi zi=new Zi();
        System.out.println(zi.num);*/
       /* PCI MainBoard  NetCard run userPCI  主板，网卡测试*/

    }/*  MainBoard mainBoard=new MainBoard();
       mainBoard.run();
       mainBoard.userPCI(new NetCard());
       mainBoard.userPCI(null);*/



    /*public static  void  AnimalEat(Animal a){

        a.eat();
        //如果a的类型是Cat就执行
        if(a instanceof Cat){
        Cat c=(Cat)a;
        c.sleep();
        }
    }*/

}
