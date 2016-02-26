package 抽象工厂模式AbstractFactory.d2;

public class NorthernVeggie implements Veggie {
    private String name;

    public NorthernVeggie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
