package 多例模式Multiton;

import java.util.HashMap;

public class KeyGenerator {

    private static KeyGenerator keygen    = new KeyGenerator();
    private static final int    POOL_SIZE = 20;
    private HashMap             keyList   = new HashMap(10);

    /**
     * 私有防止外部实例化
     */
    private KeyGenerator() {

    }

    public static KeyGenerator getInstance() {
        return keygen;
    }

    public synchronized int getNext(String keyName) {
        KeyInfo keyinfo;
        if (keyList.containsKey(keyName)) {
            keyinfo = (KeyInfo) keyList.get(keyName);
            System.out.println("key found");
        } else {
            keyinfo = new KeyInfo(POOL_SIZE, keyName);
            keyList.put(keyName, keyinfo);
            System.out.println("new key created");
        }
        return keyinfo.getNextKey();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            int key = KeyGenerator.getInstance().getNext("xxxx");
            System.out.println(key);
        }

    }

}
