/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author Dang Phuong Nam
 */
public class ApiEmailSender extends EmailSender{
    @Override
    public void send(String recipient, String subject, String body){
        if(recipient.isEmpty()){
            System.out.println("Nguoi dung khong hop le");
        }else{
            System.out.println("Dang gui email toi " + subject + "..."
                                + "\nNoi dung: " + body);
        }
    }
}
