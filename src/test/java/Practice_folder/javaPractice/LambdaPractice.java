package Practice_folder.javaPractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaPractice {
    public static void main(String[] args) {

        List<Integer> li = new ArrayList<Integer>();
        li.add(12);
        li.add(9);
        li.add(13);
        li.add(4);
        li.add(6);
        li.add(2);
        li.add(4);
        li.add(12);
        li.add(15);

        List<String> li1 = new ArrayList<String>();
        li1.add("EmIR");
        li1.add("omER");
        li1.add("SaFiyE");
        li1.add("RAnA");

        // lambdaString(li1);

        // lambdaPractice(li);
        //Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list.

        System.out.println(lambdaBoolean(li1));
    }

    public static void lambdaPractice(List<Integer> li) {

        List<Double> doubleList = li.stream().distinct().filter(t -> t > 5).map(t -> t / 2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(doubleList);


    }

    public static void lambdaString(List<String> stringList) {
        stringList.stream().map(String::toLowerCase).map(t -> new StringBuilder(t)).map(t -> t.reverse()).forEach(System.out::print);


    }

    public static boolean lambdaBoolean(List<String> stringList){
    boolean result =    stringList.stream().map(String::toLowerCase).anyMatch(t-> t.endsWith("x"));


        return result;

    }
}
