
import java.time.LocalTime;

public abstract class EmailManager {
    protected IEmailService emailService;
    
    public EmailManager(IEmailService emailService){
        this.emailService = emailService;
    }
    public abstract void schedule(String[] to, LocalTime time);
    
    public void sendEmail(){
        emailService.send( "", "", "");
    }
}
