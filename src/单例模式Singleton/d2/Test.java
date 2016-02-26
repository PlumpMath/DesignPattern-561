package 单例模式Singleton.d2;

import java.io.File;

public class Test {

    public static void main(String[] args) {
        RegSingleton s = new RegSingletonChild();
        s.about();
        RegSingletonChild.getInstance().about();
        System.out.println(System.getProperty("user.dir") + ".." + File.separator);
    }

}
