package 多例模式Multiton;

import java.util.HashMap;

public class KeyGenerator2 {

    private static HashMap   kengens   = new HashMap(10);
    private static final int POOL_SIZE = 20;
    private HashMap          keyList   = new HashMap(10);
    private KeyInfo          keyinfo;

    /**
     * 私有防止外部实例化
     */
    private KeyGenerator2() {

    }

    private KeyGenerator2(String keyName) {
        keyinfo = new KeyInfo(POOL_SIZE, keyName);
    }

    public static KeyGenerator2 getInstance(String keyName) {
        KeyGenerator2 keyG;
        if (kengens.containsKey(keyName)) {
            keyG = (KeyGenerator2) kengens.get(keyName);
        } else {
            keyG = new KeyGenerator2(keyName);
        }
        return keyG;
    }

    public synchronized int getNext() {
        return keyinfo.getNextKey();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            int key = KeyGenerator2.getInstance("xx").getNext();
            System.out.println(key);
        }

    }

}
