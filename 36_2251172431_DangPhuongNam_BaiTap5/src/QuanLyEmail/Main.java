/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QuanLyEmail;

/**
 *
 * @author Dang Phuong Nam
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IEmailServiceBuilder smtp_Build = new SmtpEmailServiceBuilder();
        IEmailServiceBuilder api_Build = new ApiEmailServiceBuilder();

        EmailServiceDirector dr1 = new EmailServiceDirector(smtp_Build);
        dr1.make();

        EmailServiceDirector dr2 = new EmailServiceDirector(api_Build);
        dr2.make();
    }
    
}
