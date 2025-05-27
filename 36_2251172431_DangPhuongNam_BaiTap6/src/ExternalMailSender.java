
import jakarta.mail.Address;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import java.time.LocalTime;
import jakarta.mail.internet.MimeMessage;

public class ExternalMailSender {
    public void scheduleSend(MimeMessage specialEmail, LocalTime time) throws MessagingException{
        Address[] recipients = specialEmail.getRecipients(Message.RecipientType.TO);
        if(recipients != null){
            for (Address recipient : recipients) {
                System.out.println("Email dang duoc gui di toi " + recipient
                            + "\nThoi gian: " + time);
            }
        }
    }
}
