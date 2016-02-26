package 抽象工厂模式AbstractFactory.d3;

public class Test {

    public static void main(String[] args) {
        PcProducter pp = (PcProducter) ComputerProducter.getInstance("pc");
        pp.createCpu();
    }

}
