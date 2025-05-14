/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai12;

/**
 *
 * @author Dang Phuong Nam
 */
public abstract class EmailServiceFactory{
    public abstract IEmailService CreateEmailService();
    public void Notify(String recipient, String message){
        IEmailService em = CreateEmailService();
        em.SendEmail(recipient, "Thông báo", message);
    }
}
class Main{
    public static void main(String[] args) {
        EmailServiceFactory api = new ApiEmailServiceFactory();
        EmailServiceFactory smtp = new SmtpEmailServiceFactory();
        
        smtp.Notify("user@example.com", "Chào bạn!");
        api.Notify("user@example.com", "Chào bạn!");    
    }
}

