package lesson11.lab.prob9;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        printSquares(4);
    }

    public static void printSquares(int num){
        Stream.iterate(1, i->i+1)
                .limit(num)
                .forEach(i->{System.out.print(i*i+" ");});
    }
}
