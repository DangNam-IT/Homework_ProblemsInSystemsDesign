public class SmtpEmail implements IEmailService {

    @Override
    public void send(String to, String subject, String body) {
        System.out.println("Email will send to " + to
                            + "\nDescription: " + body);
    }

    @Override
    public void log(String message) {
        System.out.println("Email sent success");
    }

}
