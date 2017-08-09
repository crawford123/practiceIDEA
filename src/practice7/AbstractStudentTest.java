package practice7;

public class AbstractStudentTest extends  AbstractStudent implements  smoke {
    @Override
    public void study() {
        System.out.println("不学习");
    }

    @Override
    public void smoke() {
        System.out.println("喜欢抽烟");
    }

   /* @Override
    public void smoke() {
        System.out.println("喜欢抽烟");
    }*/
}

