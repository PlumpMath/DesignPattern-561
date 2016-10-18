package 结构模式Structural.适配器模式Adapter;

public class Adapter2 implements Target {
    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        super();
        adaptee = adaptee;
    }

    @Override
    public void simpleOperation1() {
        adaptee.simpleOperation1();
    }

    @Override
    public void simpleOperation2() {
    }

}
