/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author Dang Phuong Nam
 */
public class SmtpEmailFactory implements EmailServiceFactory{

    @Override
    public EmailSender createSender() {
        return new SmtpEmailSender();
    }

    @Override
    public EmailLogger createLogger() {
        return new SmtpEmailLogger();
    }
    
}
