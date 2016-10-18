package 代理模式Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Vector;

public class VectorProxy implements InvocationHandler {
    private Object proxyobj;

    public VectorProxy(Object obj) {
        this.proxyobj = obj;
    }

    public static Object factory(Object obj) {
        Class cls = obj.getClass();
        Object proxy = Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), new VectorProxy(obj));
        return proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("brefor.." + method);
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }
        Object o = method.invoke(proxyobj, args);
        System.out.println("after.." + method);
        return o;
    }

    public static void main(String agrs[]) {
        List v = null;
        v = (List) factory(new Vector(10));
        v.add("new");
        v.add("cao");
        v.remove(0);
    }
}
