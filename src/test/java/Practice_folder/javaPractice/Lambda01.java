package Practice_folder.javaPractice;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {

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

        //Create a method to print list elements on the console in the same line with a space between them
        //When you take the task, you started to think about "How to do?" because you used "Structured Programming"
        //but if you use "Functional Programming" you will focus on "What to do?"
        printListElStructured(li);
        System.out.println();


    }
    //"Structured Programming"

    public static void printListElStructured(List<Integer> li){
        for(Integer w : li){

            System.out.println(w + " ");
        }

    }
    //Functional Programming
    //Example of Lambda Expression: "t-> System.out.print(t + " ")"
    //Using Lambda Expressions is acceptable but not recommended.
    //Instead of Lambda Expressions we will use "Method References"


}
