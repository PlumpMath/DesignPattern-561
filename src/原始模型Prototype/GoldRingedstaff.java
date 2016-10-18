package 原始模型Prototype;

import java.io.Serializable;

public class GoldRingedstaff implements Cloneable, Serializable {

    private int height = 10;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
