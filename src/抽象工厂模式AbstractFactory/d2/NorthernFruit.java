package 抽象工厂模式AbstractFactory.d2;

public class NorthernFruit implements Fruit {
    private String name;

    public NorthernFruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(this.name + "......");
    }
}
