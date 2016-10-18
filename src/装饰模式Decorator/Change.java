package 装饰模式Decorator;

public class Change implements TheGreatestSage {
    private TheGreatestSage sage;

    public Change(TheGreatestSage sage) {
        System.out.println("Change");
        this.sage = sage;
    }

    @Override
    public void move() {
        // 代码
        sage.move();
    }
}
