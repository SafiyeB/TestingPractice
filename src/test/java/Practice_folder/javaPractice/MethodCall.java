package Practice_folder.javaPractice;

public class MethodCall {

    public static void main(String[] args) {
        System.out.println(multiplyNumbers(2,3));
    }

    public static int sumNumbers(int a, int b){

        return a+b;
    }
    public static int multiplyNumbers(int a, int b){
        int result=0;
        for(int i = 0; i<b; i++){

         result+=sumNumbers(a,a) ;


        }
        return result;
    }


}
