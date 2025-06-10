/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author Dang Phuong Nam
 */
public class Client{
    private EmailSender sender;
    private EmailLogger logger;

    public Client() {
    }

    public Client(IEmailServiceFactory factory) {
        this.sender = factory.createSender();
        this.logger = factory.createLogger();
    }
    
    public void sendEmail(String recipient, String to, String message){
        sender.send(recipient, to, message);
        logger.log("Email sended to " + to + "\n" );
    }
    
    public static void main(String[] args) {  
        IEmailServiceFactory factory1 = new ApiEmailFactory();
        IEmailServiceFactory factory2 = new SmtpEmailFactory();
        
        
        Client ob1 = new Client(factory1);
        Client ob2 = new Client(factory2);

        ob1.sendEmail("user1@gmail.com", "DangNam", "hello. My name is Huyen Trang");
        ob2.sendEmail("user1@gmail.com", "HuyenTrang", "hello. My name is Nam Mit");
    }
}
