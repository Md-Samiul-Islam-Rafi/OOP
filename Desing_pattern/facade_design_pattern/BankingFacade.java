public class BankingFacade {
    private AccountService accountService;
    private Transferservices transferservices;
    private BillpaymentService billpaymentService;

    public BankingFacade(){
        accountService = new AccountService();
        transferservices = new Transferservices();
        billpaymentService = new BillpaymentService();
    }

    public void checkAccount(String accountId){
        accountService.getAccountDetailes(accountId);
    }
    public void sentMoney(String from,String to, double amount ){
        transferservices.transferFunds(from, to, amount);
    }
    public void payBill(String accountId, String billId, double amount){
        billpaymentService.payBill(accountId, billId, amount);
    }
    
}

