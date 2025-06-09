public class EmailService {
    private EmailServiceStrategy strategy;
    public void setStrategy(EmailServiceStrategy strategy){
        this.strategy = strategy;
    }
    
    public void doSomething(){
        strategy.sendEmail(strategy.toString());
    }
}

class Client{
    public static void main(String[] args) {
        EmailService email = new EmailService();
        EmailServiceStrategy smtp = new SmtpEmailStrategy();
        email.setStrategy(smtp);
        email.doSomething();
        
        EmailServiceStrategy api = new ApiEmailStrategy();
        email.setStrategy(api);
        email.doSomething();
    }
}
