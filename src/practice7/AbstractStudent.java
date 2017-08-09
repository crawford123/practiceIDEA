package practice7;

/**
 *
 * 定义接口与抽象类时，可以重写（覆盖）其中的任何方法
 */
public  abstract class AbstractStudent  {

    //学习不确定
    public  abstract  void  study();

    public  void sleep(){

        System.out.println("都在睡觉");

    }
    //抽烟不确定
//   public  abstract  void  smoke();
}
