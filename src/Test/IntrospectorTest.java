package Test;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;

import 抽象工厂模式AbstractFactory.d1.Creator1;

public class IntrospectorTest {
    public static void main(String args[]) throws IntrospectionException {
        BeanInfo beanInfo = Introspector.getBeanInfo(Creator1.class);
        System.out.println();
    }
}
