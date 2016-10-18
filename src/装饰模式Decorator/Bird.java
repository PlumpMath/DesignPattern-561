package 装饰模式Decorator;

public class Bird extends Change {
    public Bird(TheGreatestSage sage) {
        super(sage);
        System.out.println("bird");
    }

    @Override
    public void move() {
        // 代码
        System.out.println("Bird Move");
    }

    public void fly() {
        System.out.println("fly");
    }
}
