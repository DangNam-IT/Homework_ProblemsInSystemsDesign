/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai12;

/**
 *
 * @author Dang Phuong Nam
 */
public class ApiEmailServiceFactory extends EmailServiceFactory{
    @Override
    public IEmailService CreateEmailService(){
        return new ApiEmailService();
    }
}

