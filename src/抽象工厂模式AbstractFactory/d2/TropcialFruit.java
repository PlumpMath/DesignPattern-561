package 抽象工厂模式AbstractFactory.d2;

public class TropcialFruit implements Fruit {
    private String name;

    public TropcialFruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
