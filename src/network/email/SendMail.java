package network.email;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendMail {
    public static void main(String[] args) {
        final String username = "less.secure.email.for.students@gmail.com";
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        Session session = Session.getInstance(props,
                new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, "your own password");
                    }
                });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("less.secure.email.for.students@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("test@hotmail.com"));
            message.setSubject("Testing Subject");
            message.setText("Hello student,"
                    + "\n\n Congrats you succeeded sending mail\n through Java.mail API.");
            Transport.send(message);
            System.out.println("Your email has been sent successfully");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}