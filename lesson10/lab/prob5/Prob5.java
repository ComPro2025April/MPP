package lesson10.lab.prob5;

import java.util.Comparator;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Prob5 {
    // A. (Employee e) -> e.getName()
    // Method reference type: Class::instanceMethod
    Function<Employee, String> a1 = (Employee e) -> e.getName();
    Function<Employee, String> a2 = Employee::getName;

    // B. (Employee e,String s) -> e.setName(s)
    // Method reference type: Class::instanceMethod

    BiConsumer<Employee, String> b1 = ( e, s) -> e.setName(s);
    BiConsumer<Employee, String> b2 = Employee::setName;

    // C. (String s1,String s2) -> s1.compareTo(s2)
    // Method reference type: Class::instanceMethod
    BiFunction<String, String, Integer> c1 = (s1, s2) -> s1.compareTo(s2);
    BiFunction<String, String, Integer> c2 = String::compareTo;

    //            D. (Integer x,Integer y) -> Math.pow(x,y)
    BiFunction<Integer, Integer, Double> d1 = (x,y) -> Math.pow(x,y);
    BiFunction<Integer, Integer, Double> d2 = Math::pow;

    //            E. (Apple a) -> a.getWeight()
    Function<Apple, Integer> e1 = (Apple a) -> a.getWeight();
    Function<Apple, Integer> e2 = Apple::getWeight;

    //            F. (String x) -> Integer.parseInt(x);
    Function<String, Integer> f1 = (x) -> Integer.parseInt(x);
    Function<String, Integer> f2 = Integer::parseInt;

    //            G. EmployeeNameComparator comp = new EmployeeNameComparator();
//            (Employee e1, Employee e2) -> comp.compare(e1,e2)
    EmployeeNameComparator comp = new EmployeeNameComparator();
    BiFunction<Employee, Employee, Integer> g1 = (x,y) -> comp.compare(x,y);
    BiFunction<Employee, Employee, Integer> g2 = comp::compare;

    public static void main(String[] args) {
        new Prob5().evaluator();
    }

    void evaluator() {
        System.out.println(a2.apply(new Employee("Orgil")));

        b2.accept(new Employee("Orgil"),"Oumar");

        System.out.println(c2.apply("ABC","ABC") == 0);

        System.out.println(d2.apply(2,3).toString());

        System.out.println(e2.apply(new Apple(10)).toString());

        System.out.println(f2.apply("123").toString());

        System.out.println(g2.apply(new Employee("Orgil"), new Employee("Orgil")) == 0);

    }
}

class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return 0;
    }
}

class Apple{
    private int weight;

    public Apple(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}

class Employee implements Comparable<Employee> {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}
