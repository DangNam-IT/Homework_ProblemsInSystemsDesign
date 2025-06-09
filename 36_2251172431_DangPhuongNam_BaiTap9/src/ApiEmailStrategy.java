public class ApiEmailStrategy implements EmailServiceStrategy {
    @Override
    public void sendEmail(String data){
        System.out.println("this is ApiEmailStrategy");
    }
}
