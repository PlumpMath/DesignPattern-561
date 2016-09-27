package 建造Builder;

public class Client {
    private static Director director;
    private static Builder  builder;

    public static void main(String args[]) {
        for (int i = 0; i < 10; i++) {
            builder = new WelcomeBuilder();
            director = new Director(builder);
            director.construct("jianglei@skyon.com.cn", "1651687711@qq.com");
            System.out.println(i);
        }
    }
}
