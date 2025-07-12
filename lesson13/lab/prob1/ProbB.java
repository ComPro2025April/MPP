package lesson13.lab.prob1;

import java.util.ArrayList;
import java.util.List;

public class ProbB {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
//        List<? extends Number> nums = ints;//read only cannot add it
        List<? super Number> nums = new ArrayList<>();//can add
        nums.add(3.14);
    }
}
