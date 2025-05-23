/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyEmail;

/**
 *
 * @author Dang Phuong Nam
 */
public class ApiEmailServiceBuilder implements IEmailServiceBuilder{
    private ApiEmailService result = new ApiEmailService();
    @Override
    public void reset() {
        result = new ApiEmailService();
    }

    @Override
    public void buildSend() {
        result.send("To: Huyen Trang", "\nSubject: Dang Nam", "\nIts me. Your man");
    }

    @Override
    public void buildLog() {
        result.log("Gui email thanh cong toi Huyen Trang");
    }
    
    @Override
    public ApiEmailService getResult(){
        return result;
    }
    
}
