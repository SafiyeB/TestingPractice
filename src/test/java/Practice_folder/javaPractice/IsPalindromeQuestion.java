package Practice_folder.javaPractice;

public class IsPalindromeQuestion {

    public static void main(String[] args) {
        //   System.out.println(isPalindrome());
        System.out.println(isPalindrome("SAFIYE"));
        System.out.println(isPalindrome("DAD"));


    }

    public static boolean isPalindrome() {

        String S = "Emir";
        String R = "";

        for (int i = 3; i >= 0; i--) {
            R = R + S.charAt(i);


        }
        System.out.println(R);

        if (S.equals(R)) {
            return true;


        }
        return false;
    }

    public static boolean isPalindrome(String S) {
        String R = "";
        for (int i = S.length() - 1; i >= 0; i--) {
            R = R + S.charAt(i);

        }
        System.out.println(R);
        if (S.equals(R)) {
            return true;


        }
        return false;


    }


}


