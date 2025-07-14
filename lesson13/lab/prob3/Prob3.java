package lesson13.lab.prob3;

import java.util.ArrayList;
import java.util.List;

public class Prob3 {
    public static void main(String[] args) {
        List<Integer> listInteger = new ArrayList<Integer>();

        List<Number> listNumber = new ArrayList<>();

        List<? extends Number> listNumberExtends = new ArrayList<>();

        List<? extends Integer> listIntegerExtends = new ArrayList<>();

        List<? super Number> listNumberSuper = new ArrayList<>();

        List<? super Integer> listIntegerSuper = new ArrayList<>();


        List<?> listWild = new ArrayList<>();

        List<Object> listObject = new ArrayList<>();

//        listNumber = listInteger;

        listNumberExtends = listInteger;
        listIntegerExtends = listInteger;

        listNumberExtends = listNumber;
//        listIntegerExtends = listNumber;

        listNumberExtends = listIntegerExtends;
//        listNumberExtends = listIntegerSuper;

        listNumberSuper = listNumber;
        listIntegerSuper = listInteger;

//        listIntegerExtends = listNumberSuper;

        listWild = listNumber;
        listWild = listInteger;

        listWild = listObject;

//        listObject = listNumber;
//        listObject = listInteger;


//        listNumberExtends = listObject;
//        listIntegerExtends = listObject;


        listNumberSuper = listObject;
        listIntegerSuper = listObject;

//        listObject=listNumberSuper;
//        listObject=listIntegerExtends;

    }
}
