package 抽象工厂模式AbstractFactory.d3;

public class PcProducter extends ComputerProducter {
    private static PcProducter m_PcProducter = new PcProducter();

    private PcProducter() {

    }

    public Cpu createCpu() {
        System.out.println("xxxxxxxxx");
        return new PcCpu();
    }

    public static PcProducter getInstance() {
        return m_PcProducter;
    }
}
