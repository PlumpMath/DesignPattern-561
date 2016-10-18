package 代理模式Proxy.a;

public class RealSubject extends Subject {

    @Override
    public void request() {
        System.out.println("in RealSubject");
    }

}
