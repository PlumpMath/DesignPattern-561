package 原始模型Prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class Monkey implements Cloneable, Serializable {
    private int             height;
    private int             weight;
    private Date            birthDate;
    private GoldRingedstaff staff;

    public Monkey() {
        birthDate = new Date();
        staff = new GoldRingedstaff();
    }

    public Object deepClone() throws IOException, ClassNotFoundException {
        //对象 写到流中
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(this);
        //对象从流中读取
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);

        return oi.readObject();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public GoldRingedstaff getStaff() {
        return staff;
    }

    public void setStaff(GoldRingedstaff staff) {
        this.staff = staff;
    }
}
