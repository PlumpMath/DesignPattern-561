package 单例模式Singleton.d2;

public class RegSingletonChild extends RegSingleton {

    public RegSingletonChild() {

    }

    public static RegSingletonChild getInstance() {
        return (RegSingletonChild) RegSingleton.getInstance("单例模式Singleton.d2.RegSingletonChild");
    }

    @Override
    public void about() {
        System.out.println("child ....");
    }
}
