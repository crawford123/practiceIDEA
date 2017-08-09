package practice8;

public class SmallClass extends  Student{
    @Override
    public void study() {
        System.out.println("学习小班知识");
    }
    //重写父类sleep()方法
    @Override
    public void sleep() {
        System.out.println("在小班宿舍睡觉");
    }
}
