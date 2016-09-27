package Test;

import java.util.Hashtable;

import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

public class MXTest {

    public static void main(String[] args) throws NamingException {
        Hashtable env = new Hashtable();
        env.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
        env.put("java.naming.provider.url", "dns://116.228.247.77");
        //创建环境对象
        DirContext dirContext = new InitialDirContext(env);
        //读取环境对象的属性
        Attributes attrs = dirContext.getAttributes("zhaogang.com", new String[] { "MX" });
    }

}
