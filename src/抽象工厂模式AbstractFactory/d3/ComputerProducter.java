package 抽象工厂模式AbstractFactory.d3;

public abstract class ComputerProducter {
    public static ComputerProducter getInstance(String which) {
        if (which.equals("pc")) {
            return PcProducter.getInstance();
        } else if (which.equals("mac")) {
            return MacProducter.getInstance();
        }
        return null;
    }
}
