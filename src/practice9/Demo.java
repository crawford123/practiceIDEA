package practice9;

public class Demo {
    private  int num;
    public  Demo(int num){
        this.num=num;
    }
  /*  public  boolean Comper(Demo demo){
         return this.num==demo.num;//相等返回true,不等返回false
    }*/
//重写父类的equals（）方法
    @Override
    public boolean equals(Object obj) {
        return  this.num==((Demo)obj).num;//强制转换

    }
}
