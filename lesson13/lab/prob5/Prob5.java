package lesson13.lab.prob5;

//Create a generic programming solution to the problem of finding the second smallest
//element in a list. In other words, devise a public static method
//secondSmallest so that it can handle the biggest possible range of types.

import java.util.List;
import java.util.NoSuchElementException;

public class Prob5 {

    public static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {
        if (list == null || list.size() < 2) {
            throw new IllegalArgumentException("List must contain at least two elements.");
        }

        T smallest = null;
        T secondSmallest = null;

        for (T element : list) {
            if (smallest == null || element.compareTo(smallest) < 0) {
                secondSmallest = smallest;
                smallest = element;
            } else if (!element.equals(smallest) && (secondSmallest == null || element.compareTo(secondSmallest) < 0)) {
                secondSmallest = element;
            }
        }

        if (secondSmallest == null) {
            throw new NoSuchElementException("No second smallest element found (all elements may be equal).");
        }

        return secondSmallest;
    }
}
