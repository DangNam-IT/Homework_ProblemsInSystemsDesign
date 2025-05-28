import jakarta.mail.MessagingException;
import java.time.LocalTime;
public class Client {

    /**
     * @param args the command line arguments
     * @throws jakarta.mail.MessagingException
     */
    public static void main(String[] args) throws MessagingException {
        ExternalMailSender sender = new ExternalMailSender();
        IEmailService emailService = new EmailServiceAdapter(sender);
        
        String email = "from=sender@example.com;to=receiver@example.com;subject=Hello;body=This is an email.";

        emailService.schedule(email, LocalTime.now());
    }
    
}
