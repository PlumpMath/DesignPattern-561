package 抽象工厂模式AbstractFactory.d2;

public class NorthernGardener implements Gardener {
    public Fruit createFruit(String name) {
        return new NorthernFruit(name);
    }

    public Veggie createVeggie(String name) {
        return new NorthernVeggie(name);
    }
}
