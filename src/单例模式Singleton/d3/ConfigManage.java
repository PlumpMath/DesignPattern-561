package 单例模式Singleton.d3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigManage {
    private String              PFILE              = "C:/Users/kun.tang/git/DesignPattern/src/单例模式Singleton/d3/Singleton.properties";
    private File                m_file             = null;
    private long                m_lastModifiedTime = 0;
    private Properties          m_props            = null;
    private static ConfigManage m_config           = new ConfigManage();

    private ConfigManage() {
        m_file = new File(PFILE);
        m_lastModifiedTime = m_file.lastModified();
        if (m_lastModifiedTime == 0) {
            System.err.println(PFILE + " is not exists!");
        }
        m_props = new Properties();
        try {
            m_props.load(new FileInputStream(m_file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ConfigManage getInstance() {
        return m_config;
    }

    public final Object getConfigItem(String name) {
        Object defaultVal = null;
        long newTime = m_file.lastModified();
        System.out.println(newTime + "....." + m_lastModifiedTime);
        if (newTime == 0) {
            if (m_lastModifiedTime == 0) {
                System.err.println(PFILE + " is not exists!");
            } else {
                System.err.println(PFILE + " is not exists or deleted!");
            }
            return defaultVal;
        } else if (newTime > m_lastModifiedTime) {
            m_props.clear();
            try {
                m_props.load(new FileInputStream(m_file));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        m_lastModifiedTime = newTime;
        Object val = m_props.get(name);

        return val == null ? defaultVal : val;
    }
}
