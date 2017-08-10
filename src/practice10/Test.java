package practice10;

public class Test {

      public  static void main(String[] args){

           DivisionDemo divisionDemo=new DivisionDemo();
         /* try {
              System.out.println(divisionDemo.div(5,0));
          } catch (NullPointerException e){
              System.out.println("出现空指针异常");

          } catch (Exception e) {
              //处理异常的方式
             e.printStackTrace();//打印内存中的跟踪信息
              System.out.println("异常信息："+e.getMessage());
             System.out.println("出现异常了！！！！");
          }*/

          try {

               divisionDemo.div1(5,-1);
          }catch (FushuException e){
                  e.printStackTrace();//打印内存中的跟踪信息
                 System.out.println("异常信息msg："+e.getMsg());
                 System.out.println("异常信息Message："+e.getMessage());//直接通过getMessage()方法来获取自定义的异常信息
          }
      }
}
