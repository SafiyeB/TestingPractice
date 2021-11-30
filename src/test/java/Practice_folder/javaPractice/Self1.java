package Practice_folder.javaPractice;

public class Self1 {

    public static void main(String[] args) {
        System.out.println(reverse("BurakBetulTarik"));

    }
       public static String reverse(String S){

        String R = new StringBuilder(S).reverse().toString();

return R;

    }

}
