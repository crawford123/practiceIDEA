package practice10;

public class DivisionDemo {
    /**
     *
     *
     * 定义一个除法
     * @param a
     * @param b
     * @return
     */
    //throws的关键字来声明了该功能有可能会出现问题,当不确定这段代码有没有问题时使用，提高安全性
      public  int div(int a, int b) throws  Exception
      {

          return a/b;

      }


      public  int div1(int a, int b)throws  FushuException{
            if(b<0){

                throw  new FushuException("除数不能为负数");
            }

          return  a/b;
      }
}
