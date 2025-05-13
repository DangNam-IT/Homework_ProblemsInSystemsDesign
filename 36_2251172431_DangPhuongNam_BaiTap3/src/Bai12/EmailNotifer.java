/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai12;

/**
 *
 * @author Dang Phuong Nam
 */
public class EmailNotifer{
    private IEmailService emailService;

    public EmailNotifer(EmailServiceFactory factory)
    {
        emailService = factory.CreateEmailService();
    }

    public void Notify(String recipient, String message)
    {
        emailService.SendEmail(recipient, "Thông báo", message);
    }
    
    public static void main(String[] args) {
        EmailNotifer smtp = new EmailNotifer(new SmtpEmailServiceFactory());
        EmailNotifer api = new EmailNotifer(new ApiEmailServiceFactory());
        smtp.Notify("user@example.com", "Chào bạn!");
        api.Notify("user@example.com", "Chào bạn!");
    }
    
}

