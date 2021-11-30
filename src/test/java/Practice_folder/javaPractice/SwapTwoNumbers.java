package Practice_folder.javaPractice;

public class SwapTwoNumbers {
    public static void main(String[] args) {
      swapNumbers(10,20);
    }

    public static void swapNumbers(int a, int b){
         a = a + b;
         b= a - b;
         a= a-b;

        System.out.println(a +"," + b);

    }
}
