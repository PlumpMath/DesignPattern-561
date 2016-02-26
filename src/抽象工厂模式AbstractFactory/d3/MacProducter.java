package 抽象工厂模式AbstractFactory.d3;

public class MacProducter extends ComputerProducter {
    private static MacProducter m_MacProducter = new MacProducter();

    private MacProducter() {

    }

    public static MacProducter getInstance() {
        return m_MacProducter;
    }
}
