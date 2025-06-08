public class EmailSender {
    private final ServiceMediator senderMediator;
    public EmailSender( ServiceMediator senderMediator){
        this.senderMediator = senderMediator;
    }
    public void sendEmail(){
        senderMediator.notify(this, "send");
    }
}
