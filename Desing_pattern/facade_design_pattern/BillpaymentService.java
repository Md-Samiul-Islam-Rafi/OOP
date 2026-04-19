class BillpaymentService {
    public void payBill(String accountId, String billId, Double amount) {
        System.err.println("paying Bill " + billId + "from account" + accountId + "amount" + amount);
    }
}
