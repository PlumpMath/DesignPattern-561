package 单例模式Singleton.d1;

public class EagerSingleton {
    private static final EagerSingleton m_EagerSingleton = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return m_EagerSingleton;
    }
}
