/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyEmail;

/**
 *
 * @author Dang Phuong Nam
 */
public class SmtpEmailServiceBuilder implements IEmailServiceBuilder {
    private SmtpEmailService result = new SmtpEmailService();
    @Override
    public void reset() {
        result = new SmtpEmailService();
    }
    
    @Override
    public void buildSend(){
        result.send("To: DangNam", "\nSubject: Huyen Trang", "\nIts me. Your love");
    }
    
    @Override
    public void buildLog(){
        result.log("Gui email thanh cong toi DangNam");
    }
    
    @Override
    public SmtpEmailService getResult(){
        return result;
    }    
}
