package practice10;

/**
 *
 *
 * 自定义一个除数为负数的异常
 */
public class FushuException extends Exception {

       public  String msg;
       public  FushuException(String msg){

          super(msg);//直接将值传给父类的message,然后通过父类的getMessage()输出
          this.msg=msg;
       }

    public String getMsg() {
        return msg;
    }
}
