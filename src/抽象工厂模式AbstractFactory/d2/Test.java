package 抽象工厂模式AbstractFactory.d2;

public class Test {

    public static void main(String[] args) {
        //创建具体工程的实例，调用工厂对象的方法，得到所需产品对象
        NorthernFruit nr = (NorthernFruit) new NorthernGardener().createFruit("xx");
        nr.print();

    }

}
