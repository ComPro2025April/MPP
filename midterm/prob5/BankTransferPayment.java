package midterm.prob5;

public non-sealed class BankTransferPayment implements Payment {
    private String bankAccount;
    private String routingNumber;

    public BankTransferPayment(String bankAccount, String routingNumber) {
        this.bankAccount = bankAccount;
        this.routingNumber = routingNumber;
    }

    public String getPaymentDetails(){
        return "Bank Transfer Payment";
    }
}
