package 抽象工厂模式AbstractFactory.d3;

public class PcProducter extends ComputerProducter {
    private static PcProducter m_PcProducter = new PcProducter();

    public PcProducter() {

    }

    public static PcProducter getInstance() {
        return m_PcProducter;
    }
}
