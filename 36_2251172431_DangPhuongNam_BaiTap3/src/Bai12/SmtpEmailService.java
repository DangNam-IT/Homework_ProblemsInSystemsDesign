/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai12;

/**
 *
 * @author Dang Phuong Nam
 */
public class SmtpEmailService implements IEmailService{
    @Override
    public boolean SendEmail(String to, String subject, String body){
        if(!"".equals(to)){
            System.out.println("Gui email thanh cong toi "+ to +" qua SMTP");
            return true;
        }else{
            System.out.println("Dia chi email khong hop le");
            return false;
        }
    }
}
