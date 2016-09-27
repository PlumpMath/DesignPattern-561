package 建造Builder;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

public abstract class AutoMessage {
    protected String subject  = "";
    protected String body     = "";
    protected String from     = "";
    protected String to       = "";
    protected Date   sendDate = null;

    public AutoMessage() {

    }

    public void send() {
        //SMTP服务器地址
        String smtpHost = "smtp.qq.com";
        //发送者的地址
        //String from = "kun.tang@qq.com";
        //收信者地址
        // String to = "test@qq.com";
        Properties props = new Properties();
        props.put("mail.smtp.host", smtpHost);
        props.put("mail.smtp.auth", "true");
        //采用ssl
        props.put("mail.smtp.starttls.enable", "true");
        Session session = Session.getDefaultInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, "xowewpyiayznedga");//登录用户名/密码
            }
        });
        session.setDebug(false);
        try {
            InternetAddress[] address = { new InternetAddress(to) };
            MimeMessage message;
            //创建message对象
            message = new MimeMessage(session);
            //设置发件人
            message.setFrom(new InternetAddress(from));
            //设置收件人
            message.setRecipients(RecipientType.TO, address);
            //设置主题
            message.setSubject(subject);
            message.setSentDate(sendDate);
            message.setText(body);
            //HTML输出格式
            //message.setDataHandler(new DataHandler("", "text/html;charset=UTF-8"));
            Transport.send(message);
            System.out.println("mail has been sent");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }
}
