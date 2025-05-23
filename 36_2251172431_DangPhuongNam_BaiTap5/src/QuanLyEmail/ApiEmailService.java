/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyEmail;

/**
 *
 * @author Dang Phuong Nam
 */
public class ApiEmailService {
    public void send(String to, String subject, String body){
        System.out.println(to + subject + body);
    }
    
    public void log(String message){
        System.out.println(message);
    }
}
