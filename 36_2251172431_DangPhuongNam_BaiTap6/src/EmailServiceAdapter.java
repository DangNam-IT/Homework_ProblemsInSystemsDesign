import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.time.LocalTime;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmailServiceAdapter implements IEmailService {
    
    private final ExternalMailSender adaptee;

    public EmailServiceAdapter(ExternalMailSender adaptee) {
        this.adaptee = adaptee;
    }
    
    @Override
    public void send(String to, String subject, String message) {
        
    }

    @Override
    public void log(String message) {
        
    }
    
    private MimeMessage convertToMimeMessage(String data) throws MessagingException{
        Map<String, String> map = parseStringData(data);
        Properties props = new Properties();
        Session session = Session.getDefaultInstance(props);
        
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(map.get("from")));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(map.get("to")));
        message.setSubject(map.getOrDefault("subject", "No Subject"));
        message.setText(map.getOrDefault("body", ""));
        return message;
    }
    
    private Map<String, String> parseStringData(String data) throws MessagingException{
        Map<String, String> map = new HashMap<>();
        String[] pairs = data.split(";");
        for (String pair : pairs) {
            String[] keyValue = pair.split("=", 2);
            if(keyValue.length == 2)
                map.put(keyValue[0].trim(), keyValue[1].trim());
        }
        return map;
    }
    
    @Override
    public void schedule(String email, LocalTime time) {
        try {
            MimeMessage specialEmail = convertToMimeMessage(email);
            adaptee.scheduleSend(specialEmail, time);
        } catch (MessagingException ex) {
            Logger.getLogger(EmailServiceAdapter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
