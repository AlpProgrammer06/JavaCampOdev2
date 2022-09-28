public class CustomerManager {
    private Baselogger logger;


    public CustomerManager(Baselogger logger){
        this.logger=logger;

    }
    public  void add(){
        System.out.println("Müşteri eklendi ");
        this.logger.log("Log mesajı");
    }
}
