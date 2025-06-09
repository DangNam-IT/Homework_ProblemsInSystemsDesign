public class SmtpEmailStrategy implements EmailServiceStrategy {
    @Override
    public void sendEmail(String data){
        System.out.println("This is smtp_Email");
    }
}
