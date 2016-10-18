package 代理模式Proxy.a;

public class Test {

    public static void main(String[] args) {
        Subject subject = new ProxySubject();
        subject.request();
    }

}
