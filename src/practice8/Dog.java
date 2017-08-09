package practice8;

public class Dog extends  Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void sleep() {
        System.out.println("狗在睡觉");

    }
}