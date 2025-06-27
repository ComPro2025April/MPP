package lesson4.lab.probC;

public class Hourly extends Employee {
    private double hourlyWage;
    private double hoursPerWeek;

    public Hourly(double hourlyWage, double hoursPerWeek) {
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    public double calcGrossPay(int months, int years){
        return 4 * hoursPerWeek * hourlyWage;
    }
}
