package lesson4.lab.probE;

public class SavingsAccount implements Account {
    private String acctId;
    private double balance;
    private double interestRate;

    public SavingsAccount(String acctId, double balance, double interestRate) {
        this.acctId = acctId;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public String getAccountID(){
        return acctId;
    }
    public double getBalance(){
        return balance;
    }
    public double computeUpdatedBalance(){
        return balance + (interestRate * balance);
    }
}
