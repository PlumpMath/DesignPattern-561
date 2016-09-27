package 建造Builder;

import java.util.Date;

public abstract class Builder {
    protected AutoMessage msg;

    public Builder() {

    }

    //主题建造方法
    public abstract void buildSubject();

    //内容建造方法
    public abstract void buildBody();

    //发件人建造方法
    public void buildFrom(String from) {
        msg.setFrom(from);
    }

    //收件人建造方法
    public void buildTo(String to) {
        msg.setTo(to);
    }

    //发送时间建造防范
    public void buildSendDate() {
        msg.setSendDate(new Date());
    }

    public void sendMessage() {
        msg.send();
    }
}
