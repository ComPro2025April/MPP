package lesson11.lab.prob10b;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Bill","Thomas","Mary");

        System.out.println(
                names.stream()
                        .collect(Collectors.joining(","))
        );

    }
}
