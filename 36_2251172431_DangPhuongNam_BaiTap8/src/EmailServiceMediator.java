public class EmailServiceMediator implements ServiceMediator{
    private EmailComposer composer;
    private EmailSender sender;
    private EmailReceiver inbox;
    private EmailStorage storage;
    @Override
    public void notify(Object ob, String event) {
        if(ob == composer)
            handleCompose();
        if(ob == sender)
            handleSend();
        if(ob == inbox)
            handleReceive();
        if(ob == storage)
            handleStorage();
        System.out.println("Event: " + event);
    }

    public void handleCompose(){
        composer.composeEmail();
    }
    
    public void handleSend(){
        sender.sendEmail();
    }
    
    public void handleReceive(){
        inbox.receiveEmail();
    }
    
    public void handleStorage(){
        storage.saveEmail();
    }
    
    public class Client{
        public static void main(String[] args) {
            
            ServiceMediator service = new EmailServiceMediator();
            EmailComposer com = new EmailComposer(service);
            com.composeEmail();
            
            EmailSender send = new EmailSender(service);
            send.sendEmail();
            
            EmailReceiver inbox = new EmailReceiver(service);
            inbox.receiveEmail();
            
            EmailStorage save = new EmailStorage(service);
            save.saveEmail();
        }
    }
}


