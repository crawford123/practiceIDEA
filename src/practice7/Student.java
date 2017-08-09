package practice7;

public class Student implements  Person,Person2 {
    @Override
    public void speak() {
        System.out.println("说话");
    }

    @Override
    public void work() {
        System.out.println("工作");
    }
}
