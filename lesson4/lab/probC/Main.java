package lesson4.lab.probC;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();

        Hourly hourly = new Hourly(15,40);

        Salaried salaried = new Salaried(10000);

        Commissioned commissioned = new Commissioned(20, 5000);
        commissioned.addOrder(new Order("1", LocalDate.of(2025, 5, 1), 10000));
        commissioned.addOrder(new Order("1", LocalDate.of(2025, 6, 1), 20000));

        employees.add(hourly);
        employees.add(salaried);
        employees.add(commissioned);

        for (Employee employee : employees) {
            employee.print();
        }
    }
}
