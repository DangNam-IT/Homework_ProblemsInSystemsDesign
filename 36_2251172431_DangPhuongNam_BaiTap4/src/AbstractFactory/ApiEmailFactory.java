/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author Dang Phuong Nam
 */
public class ApiEmailFactory implements EmailServiceFactory{
    @Override
    public EmailSender createSender(){
        return new ApiEmailSender();
    }
    @Override
    public EmailLogger createLogger(){
        return new ApiEmailLogger();
    }
}
