/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ht12;

/**
 *
 * @author Dang Phuong Nam
 */
public class EmailNotifer {
    IEmailService emailService;

    public EmailNotifer(IEmailService emailService) {
        this.emailService = emailService;
    }
    public void Notify (String recipient, String message){
        emailService.SendEmail(recipient, "Thong bao", message);
    }
    public static void main(String[] args) {
        EmailNotifer smtp = new EmailNotifer(new SmtpEmailService());
        EmailNotifer api = new EmailNotifer(new ApiEmailService());
        smtp.Notify("user@example.com", "Chào bạn!");
        api.Notify("user@example.com", "Chào bạn!");
    }
}
