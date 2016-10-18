package 装饰模式Decorator;

public class Fish extends Change {
    public Fish(TheGreatestSage sage) {
        super(sage);
        System.out.println("Fish");
    }

    @Override
    public void move() {
        // 代码
        System.out.println("Fish Move");
    }
}
