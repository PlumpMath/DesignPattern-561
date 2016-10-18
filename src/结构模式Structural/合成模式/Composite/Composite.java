package 结构模式Structural.合成模式.Composite;

import java.util.Enumeration;
import java.util.Vector;

public class Composite implements Component {
    private Vector<Component> componentVector = new Vector<Component>();

    @Override
    public Composite getComposite() {
        return this;
    }

    @Override
    public void simpleOperation() {
        Enumeration enumeration = components();
        while (enumeration.hasMoreElements()) {
            ((Component) enumeration.nextElement()).simpleOperation();
        }
    }

    public void add(Component component) {
        componentVector.add(component);
    }

    public void remove(Component component) {
        componentVector.remove(component);
    }

    public Enumeration<Component> components() {
        return componentVector.elements();
    }
}
