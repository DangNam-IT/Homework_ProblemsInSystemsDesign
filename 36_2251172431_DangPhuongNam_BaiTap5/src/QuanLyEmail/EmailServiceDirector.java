/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyEmail;
/**
 *
 * @author Dang Phuong Nam
 */
public class EmailServiceDirector {
    private IEmailServiceBuilder _emailService;
    public EmailServiceDirector(IEmailServiceBuilder emailService){
        _emailService = emailService;
    }
    
    public void changeIEmailServiceBuilder(IEmailServiceBuilder emailService){
        _emailService = emailService;
    }
    
    public void make(){
        _emailService.buildSend();
        _emailService.buildLog();
    }
}
