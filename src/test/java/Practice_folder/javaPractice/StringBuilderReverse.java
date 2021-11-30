package Practice_folder.javaPractice;

public class StringBuilderReverse {
    public static void main(String[] args) {
        System.out.println(reverseString("Amerika"));
    }

    public static String reverseString(String S) {
        String R = new StringBuilder(S).reverse().toString();

        return R;

    }

}
