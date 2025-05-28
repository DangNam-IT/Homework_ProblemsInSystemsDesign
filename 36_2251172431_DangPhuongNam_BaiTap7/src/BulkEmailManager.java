
import java.time.LocalTime;

public class BulkEmailManager extends EmailManager {
    
    public BulkEmailManager(IEmailService emailService){
        super(emailService);
    }
    @Override
    public void schedule(String[] to, LocalTime time){
        System.out.print("Email sent to ");
        for (String ob : to) {
            System.out.print(ob + " / ");
        }
        System.out.println(" at " + time.toString());
    }
    
   
    public void send(){
        super.sendEmail();
    }
    
    public static int statistical(String message){
        int num = 0;
        if("Completed".equals(message))
            num++;
        return num;
    }
}
