/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package QuanLyEmail;

/**
 *
 * @author Dang Phuong Nam
 */
public interface IEmailServiceBuilder {
    void reset();
    void buildSend();
    void buildLog();
    Object getResult();
}
