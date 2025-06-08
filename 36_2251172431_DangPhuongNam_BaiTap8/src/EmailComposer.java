public class EmailComposer {
    private final ServiceMediator composerMediator;
    
    public EmailComposer(ServiceMediator composerMediator){
        this.composerMediator = composerMediator;
    }
    public void composeEmail(){
        composerMediator.notify(this, "compose");
    }
}
