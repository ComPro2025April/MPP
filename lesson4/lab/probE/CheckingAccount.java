package lesson4.lab.probE;

public class CheckingAccount implements Account {
    private String acctId;
    private double balance;
    private double monthlyFee;

    public CheckingAccount(String acctId, double balance, double monthlyFee) {
        this.acctId = acctId;
        this.balance = balance;
        this.monthlyFee = monthlyFee;
    }


    public String getAccountID(){
        return acctId;
    }
    public double getBalance(){
        return balance;
    }
    public double computeUpdatedBalance(){
        return balance - monthlyFee;
    }
}
