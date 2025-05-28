import java.time.LocalTime;
public interface IEmailService {
    void send(String to, String subject, String message);
    void log(String message);
    void schedule(String email, LocalTime time);
}
