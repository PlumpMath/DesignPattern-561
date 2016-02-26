package 单例模式Singleton.d2;

public class Test {

    public static void main(String[] args) {
        RegSingleton s = new RegSingletonChild();
        s.about();
        RegSingletonChild.getInstance().about();
    }

}
