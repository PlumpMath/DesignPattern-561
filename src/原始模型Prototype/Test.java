package 原始模型Prototype;

import java.io.IOException;

public class Test {
    private Monkey monkey = new Monkey();

    public void change() throws ClassNotFoundException, IOException {
        Monkey copyMonkey;
        for (int i = 0; i < 10; i++) {
            copyMonkey = (Monkey) monkey.deepClone();
            System.out.println(monkey == copyMonkey);
            System.out.println(monkey.getStaff() == copyMonkey.getStaff());
            System.out.println(monkey.getStaff().getHeight());
            System.out.println(copyMonkey.getStaff().getHeight());
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Test t = new Test();
        t.change();
    }

}
