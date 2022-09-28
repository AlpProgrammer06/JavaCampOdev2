public class Main {
    public static void main(String[] args) {
          /*  Baselogger [] loggers =new Baselogger[] {new FileLogger(), new DataBaseLogger(), new EmailLogger(),new ConsoleLgger()};
            for(Baselogger logger : loggers){
                logger.log("log mesajı");
            }*/

        CustomerManager customerManager =new CustomerManager(new DataBaseLogger());
        customerManager.add();
    }
}