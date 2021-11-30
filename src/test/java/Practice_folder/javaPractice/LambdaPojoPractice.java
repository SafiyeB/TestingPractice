package Practice_folder.javaPractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaPojoPractice {

    public static void main(String[] args) {

        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 90, 144);

        List<Course> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        //System.out.println(checkAveScore(coursesList));
        // System.out.println(highestScore(coursesList).toString());
        printThird(coursesList);

    }

    public static boolean checkAveScore(List<Course> li) {
        return li.stream().allMatch(t -> t.getAveScore() > 91);

    }

    public static Course highestScore(List<Course> li) {
        Course result = li.stream().sorted(Comparator.comparing(Course::getAveScore).reversed()).findFirst().get();

        return result;
    }

    //  sort list elements according to average score in ascending order and print just the 3rd score

    public static void printThird(List<Course> li) {
        // System.out.println(li.stream().sorted(Comparator.comparing(Course::getAveScore)).skip(2).findFirst().get());
        System.out.println(li.stream().sorted(Comparator.comparing(Course::getAveScore)).skip(2).limit(1).collect(Collectors.toList()));


    }
}
