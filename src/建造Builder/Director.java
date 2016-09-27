package 建造Builder;

public class Director {
    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    //产品构造方法
    public void construct(String toAddress, String fromAddress) {
        this.builder.buildSubject();
        this.builder.buildBody();
        this.builder.buildTo(toAddress);
        this.builder.buildFrom(fromAddress);
        this.builder.buildSendDate();
        this.builder.sendMessage();
    }
}
