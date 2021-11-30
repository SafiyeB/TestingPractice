package Practice_folder.javaPractice;

import java.util.Arrays;
import java.util.List;

public class ArraysPractice {

    /*                              10 Minutes
   Given an array of integers, you have to find all pairs of elements in this array
   such that whose sum must be equal to a given number.
   For example, if {4, 5, 7, 11, 9, 13, 8, 12} is an array and 20 is the given number,
   then you have to find all pairs of elements in this array whose sum must be 20.
   In this example, (9, 11), (7, 13) and (8, 12) are such pairs whose sum is 20.
*/
    public static void main(String[] args) {
        findPairs(new int[]{4, 5, 7, 11, 9, 13, 8, 12}, 20);
    }

    public static void findPairs(int arr[], int number) {
        for (int i = 0; i < arr.length; i++) {
            List copyarr = Arrays.asList(arr);
            if (copyarr.contains(number - arr[i])) {

                System.out.println(arr[i] + ":" + (number - arr[i]));

            }


        }


    }

}

