package practice7;

public class AbstractStudentTest1 extends  AbstractStudent implements smoke {
    @Override
    public void study() {
        System.out.println("非常喜欢学习");
    }

    @Override
    public void smoke() {
        System.out.println("不抽烟");
    }
/*
    @Override
    public void smoke() {
        System.out.println("不抽烟");
    }*/
}
