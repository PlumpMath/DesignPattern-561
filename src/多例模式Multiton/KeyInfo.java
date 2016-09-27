package 多例模式Multiton;

public class KeyInfo {
    private int    keyMax;
    private int    keyMin;
    private int    nextKey;
    private int    poolSize;
    private String keyName;

    public KeyInfo(int poolSize, String keyName) {
        this.poolSize = poolSize;
        this.keyName = keyName;
        retrieveFromDB();
    }

    public int getKeyMax() {
        return this.keyMax;
    }

    public int getKeyMin() {
        return this.keyMin;
    }

    public int getNextKey() {
        if (this.nextKey > this.keyMax) {
            retrieveFromDB();
        }
        return this.nextKey++;
    }

    private void retrieveFromDB() {
        //sql update key=key+poolSzie where keyname=;
        //select
        int keyFromDB = 1000;
        this.keyMax = keyFromDB;
        this.keyMin = keyFromDB - this.poolSize + 1;
        this.nextKey = this.keyMin;

    }
}
