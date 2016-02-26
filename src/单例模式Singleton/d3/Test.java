package 单例模式Singleton.d3;

public class Test {

    public static void main(String[] args) {
        System.out.println(ConfigManage.getInstance().getConfigItem("a"));
    }

}
