package 结构模式Structural.合成模式.Composite;

public class Leaf implements Component {

    @Override
    public Composite getComposite() {
        return null;
    }

    @Override
    public void simpleOperation() {
    }

}
