package lesson4.lab.probC;

public class Salaried extends Employee {
    private double salary;

    public Salaried(double salary) {
        this.salary = salary;
    }

    public double calcGrossPay(int months, int years){
        return salary;
    }
}
