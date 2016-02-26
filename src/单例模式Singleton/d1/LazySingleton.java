package 单例模式Singleton.d1;

public class LazySingleton {
    private static LazySingleton m_LazySingleton = null;

    private LazySingleton() {

    }

    public synchronized static LazySingleton getInstance() {
        if (m_LazySingleton == null) {
            m_LazySingleton = new LazySingleton();
        }
        return m_LazySingleton;
    }
}
