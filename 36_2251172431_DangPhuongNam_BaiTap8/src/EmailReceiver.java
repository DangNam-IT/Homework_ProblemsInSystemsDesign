public class EmailReceiver {
    private final ServiceMediator receiverMediator;
    
    public EmailReceiver( ServiceMediator receiverMediator){
        this.receiverMediator = receiverMediator;
    }
    public void receiveEmail(){
        receiverMediator.notify(this, "receive");
    }
}
