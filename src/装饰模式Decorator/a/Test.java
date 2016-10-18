package 装饰模式Decorator.a;

public class Test {

    public static void main(String[] args) {
        Component c = new ConcreteComponent();
        Component c1 = new ConcreteDecoratorA(c);
        Component c2 = new ConcreteDecoratorB(c);
    }

}
