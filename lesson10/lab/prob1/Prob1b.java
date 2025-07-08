package lesson10.lab.prob1;


// b. An example of a method reference is: Math::random Its corresponding functional interface is Supplier<Double>.
// Do the following:

// i. Rewrite this method reference as a lambda expression

// ii. Put this method expression in a main method in a Java class and use it to print a random number to the console

// iii. Create an equivalent Java class in which the functional behavior of Math::random
// is expressed using an inner class (implementing Supplier);
// call this inner class from a main method and use it to output a random number to the console.
// The behavior should be the same as in part ii.

import java.util.function.Supplier;

public class Prob1b {
    public static void main(String[] args) {
        Supplier<Double> supplier = () -> Math.random();
        System.out.println(supplier.get());

        System.out.println(new RandomSupplier().get());
    }

    static class RandomSupplier implements Supplier<Double> {
        @Override
        public Double get() {
            return Math.random();
        }
    }
}

