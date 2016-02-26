package 抽象工厂模式AbstractFactory.d1;

public class Creator1 implements Creator {

    @Override
    public ProductA factoryA() {
        return new ProductA1();
    }

    @Override
    public ProductB factoryB() {
        return new ProductB1();
    }

}
