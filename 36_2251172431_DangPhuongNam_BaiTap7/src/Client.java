
import java.time.LocalTime;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Dang Phuong Nam
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IEmailService smtp = new SmtpEmail();
        IEmailService api = new ApiEmail();
        
        ScheduledEmailManager schedule = new ScheduledEmailManager(smtp);
        BulkEmailManager bulk = new BulkEmailManager(api);
        
        String[] recipient = {"Huyen Trang", "Huy Hoang", "My mom"};
        schedule.schedule(recipient, LocalTime.now());
        bulk.schedule(recipient, LocalTime.now());
    }
    
}
