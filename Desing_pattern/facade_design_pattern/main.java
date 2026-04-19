//client Class
public class main {
    public static void main(String[] args) {
        BankingFacade facade = new BankingFacade();

        facade.checkAccount("1234");
        facade.sentMoney("234", "32", 1220);
        facade.payBill("1234", "Bl1233", 500);

    
    }
    

}
