package 建造Builder;

public class WelcomeBuilder extends Builder {
    private static final String subject = "welcome subject";

    public WelcomeBuilder() {
        msg = new WelcomeMessage();
    }

    @Override
    public void buildSubject() {
        msg.setSubject(subject);
    }

    @Override
    public void buildBody() {
        msg.setBody("welcome body小肥猪！<table border=1><tr><td><a>1</a></td><td>2</td></tr></table>");
    }

    public void sendMesage() {
        msg.send();
    }
}
