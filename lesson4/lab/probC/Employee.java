package lesson4.lab.probC;

import java.time.LocalDate;
import java.util.UUID;

public abstract class Employee {
    private String empId;

    public Employee() {
        this.empId = UUID.randomUUID().toString();
    }

    final void print(){
        LocalDate today = LocalDate.now();
        System.out.println("Emp ID: "+ empId + " " + calcCompensation(today.getMonthValue(), today.getYear()));
    }

    final Paycheck calcCompensation(int months, int years){
        Paycheck paycheck = new Paycheck();
        paycheck.setGrossPay(calcGrossPay(months, years));
        return paycheck;
    }

    public abstract double calcGrossPay(int months, int years);
}
