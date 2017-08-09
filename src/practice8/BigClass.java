package practice8;

public class BigClass extends  Student {
    @Override
    public void study() {
        System.out.println("学习大班知识");
    }
    @Override
    //重写父类sleep()方法
    public void sleep() {
        System.out.println("在大班宿舍睡觉");
    }
}
