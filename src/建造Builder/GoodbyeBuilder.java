package 建造Builder;

public class GoodbyeBuilder extends Builder {
    private static final String subject = "goodbye subject";

    public GoodbyeBuilder() {
        msg = new GoodbyeMessage();
    }

    @Override
    public void buildSubject() {
        msg.setSubject(subject);
    }

    @Override
    public void buildBody() {
        msg.setBody("goodbye body");
    }

    @Override
    public void sendMessage() {
        msg.send();
    }
}
