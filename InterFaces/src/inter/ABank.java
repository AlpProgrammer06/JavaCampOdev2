package inter;

public class ABank {
    private String bankaadi;
    private String terminalId;
    private String password;


    public ABank(String bankaadi, String terminalId, String password) {
        this.bankaadi = bankaadi;
        this.terminalId = terminalId;
        this.password = password;


    }

    public  void connect(){
        System.out.println(this.bankaadi + " bağlandı !");
    }

    public void payment(double price, String carNo, String Date, String cvc){
        System.out.println("bankadan ");
        System.out.println("işlem başarılı ");
    }
    public String getBankaadi(){
        return this.bankaadi;
    }
    public void setBankaadi(String bankaadi){
        this.bankaadi=bankaadi;
    }
    public String getTerminalId(){
        return this.terminalId;
    }
    public void setTerminalId(String bankaadi){
        this.terminalId=terminalId;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String bankaadi){
        this.password=password;
    }
}
