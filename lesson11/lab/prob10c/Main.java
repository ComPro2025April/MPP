package lesson11.lab.prob10c;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        myIntStream(List.of(1,2,3,4,5,6,7,8));
    }

    public static void myIntStream(List<Integer> integers) {
        integers.stream().max(Integer::compare).ifPresent(System.out::println);
        integers.stream().min(Integer::compare).ifPresent(System.out::println);
    }
}
