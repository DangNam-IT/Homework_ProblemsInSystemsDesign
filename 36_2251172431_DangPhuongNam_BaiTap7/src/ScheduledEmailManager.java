
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ScheduledEmailManager extends EmailManager{
    public ScheduledEmailManager(IEmailService emailService){
        super(emailService);
    }
    
    @Override
    public void schedule(String[] to, LocalTime time){
        System.out.print("Email sent to ");
        for (String ob : to) {
            try {
                System.out.print(ob + " / ");
                Thread.sleep(700);
            } catch (InterruptedException ex) {
                Logger.getLogger(ScheduledEmailManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println(" at " + time.toString());
    }
    
    public void send(){
        super.sendEmail();
    }
    
    public int statistical(String message){
        int num = 0;
        if("Email sent success".equals(message))
            num++;
        return num;
    }
}
