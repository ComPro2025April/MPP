package lesson4.lab.probC;

public class Paycheck {
    private double grossPay;
    private double fica;
    private double state;
    private double localTax;
    private double medicare;
    private double socialSecurity;

    public Paycheck() {
        this.state = 5;
        this.fica = 23;
        this.localTax = 1;
        this.medicare= 3;
        this.socialSecurity = 7.5;
    }

    @Override
    public String toString() {
        return "Paycheck{" +
                "grossPay=" + grossPay +
                ", fica=" + fica +
                ", state=" + state +
                ", localTax=" + localTax +
                ", medicare=" + medicare +
                ", socialSecurity=" + socialSecurity +
                ", netPay=" + getNetPay() +
                '}';
    }

    public void setGrossPay(double grossPay){
        this.grossPay = grossPay;
    }

    void print(){
        System.out.println(toString());
    }

    double getNetPay(){
        double deductions = this.state + this.fica + this.localTax + this.medicare + this.socialSecurity;
        double netPay = this.grossPay * (1 - deductions / 100);

        return netPay;
    }
}
