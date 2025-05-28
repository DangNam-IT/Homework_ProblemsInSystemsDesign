/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Dang Phuong Nam
 */
public interface IEmailService {
    void send(String to, String subject, String body);
    void log(String message);
}
