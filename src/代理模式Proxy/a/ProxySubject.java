package 代理模式Proxy.a;

public class ProxySubject extends Subject {
    private RealSubject realSubject;

    @Override
    public void request() {
        preRequest();
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
        postRequest();
    }

    public void preRequest() {
        System.out.println("preRequest");
    }

    public void postRequest() {
        System.out.println("postRequest");
    }
}
