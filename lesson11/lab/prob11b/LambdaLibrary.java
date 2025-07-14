package lesson11.lab.prob11b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {

    // TriFunction: (List<Employee>, String firstName, Integer salaryThreshold) -> List<Employee>
    public static final TriFunction<List<Employee>, String, Integer, List<Employee>>
            filterByFirstNameAndSalary = (employees, firstName, salaryThreshold) ->
            employees.stream()
                    .filter(e -> e.getFirstName().equals(firstName))
                    .filter(e -> e.getSalary() > salaryThreshold)
                    .collect(Collectors.toList());
}
