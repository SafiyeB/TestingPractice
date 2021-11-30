package Practice_folder.javaPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharOccurrence {
    public static void main(String[] args) {
        // System.out.println(countCharOccur("abccdaaddd"));

        secondWay("abccdaaddd");
    }

    // abccdaaddd
    public static String countCharOccur(String S) {

        String remDup = "";

        for (int i = 0; i < S.length(); i++) {

            if (!remDup.contains(S.charAt(i) + "")) {
                remDup += S.charAt(i);


            }
        }

        String arr[] = remDup.split("");
        int arr2[] = new int[arr.length];
        List arrcopy = Arrays.asList(arr);
        for (int i = 0; i < S.length(); i++) {
            int index = arrcopy.indexOf(S.charAt(i) + "");

            arr2[index]++;


        }
        String result = "";

        for (int i = 0; i < arr2.length; i++) {
            result += arr[i] + ":" + arr2[i] + ",";


        }
        return result;
    }

    public static void secondWay(String S) {
        Map<String, Integer> myHashMap = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            myHashMap.put(S.charAt(i) + "", 0);


        }
        for (int i = 0; i < S.length(); i++) {
            myHashMap.put(S.charAt(i) + "", myHashMap.get(S.charAt(i) + "") + 1);


        }

        System.out.println(myHashMap);


    }
}
