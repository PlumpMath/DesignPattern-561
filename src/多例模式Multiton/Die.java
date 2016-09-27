package 多例模式Multiton;

import java.util.Date;
import java.util.Random;

/**
 * 
 * <pre>
 * 有上线多例模式
 * </pre>
 *
 * @author kun.tang
 * @version $Id: Die.java, v 0.1 2016年9月22日 下午4:24:05 kun.tang Exp $
 */
public class Die {
    private static Die die1 = new Die();
    private static Die die2 = new Die();

    /**
     * private 不能继承
     */
    private Die() {
    };

    public static Die getInstance(int whichOne) {
        if (whichOne == 1) {
            return die1;
        } else {
            return die2;
        }
    }

    /**
     * 
     * <pre>
     * 掷骰子
     * </pre>
     *
     * @return
     */
    public synchronized int dice() {
        Date d = new Date();
        Random r = new Random(d.getTime());
        int value = r.nextInt();
        System.out.println(value);
        value = Math.abs(value);
        System.out.println(value);
        value = value % 6;
        System.out.println(value);
        value += 1;
        System.out.println(value);
        return value;
    }

    public static void main(String rags[]) {
        Die.getInstance(1).dice();
    }

}
