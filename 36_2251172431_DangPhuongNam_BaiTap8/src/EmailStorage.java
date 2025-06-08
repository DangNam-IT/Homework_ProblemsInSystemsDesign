public class EmailStorage {
    private final ServiceMediator storageMediator;
    
    public EmailStorage(ServiceMediator storageMediator){
        this.storageMediator = storageMediator;
    }
    public void saveEmail(){
        storageMediator.notify(this,"save");
    };
}
