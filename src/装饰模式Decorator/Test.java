package 装饰模式Decorator;

public class Test {
    public static void main(String args[]) {
        TheGreatestSage sage = new Monkey();
        // 第一种写法
        //Bird bird = new Bird(sage);
        //TheGreatestSage fish = new Fish(bird);
        // 第二种写法
        TheGreatestSage fish = new Fish(new Bird(sage));
        fish.move();
        //bird.fly();

    }
}
