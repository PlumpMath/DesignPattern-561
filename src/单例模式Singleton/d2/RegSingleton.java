package 单例模式Singleton.d2;

import java.util.HashMap;

public class RegSingleton {
    private static HashMap<String, Object> m_registry = new HashMap<String, Object>();

    static {
        RegSingleton m_RegSingleton = new RegSingleton();
        m_registry.put(m_RegSingleton.getClass().getName(), m_RegSingleton);
    }

    protected RegSingleton() {

    }

    public static RegSingleton getInstance(String name) {
        if (name == null) {
            name = "单例模式Singleton.d2.RegSingleton";
        }
        if (m_registry.get(name) == null) {
            try {
                m_registry.put(name, Class.forName(name).newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return (RegSingleton) m_registry.get(name);
    }

    public void about() {
        System.out.println("I am   RegSingleton!");
    }
}
