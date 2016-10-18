package 装饰模式Decorator.a;

public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    //委派给构建
    @Override
    public void simpleOperation() {
        component.simpleOperation();
    }

}
