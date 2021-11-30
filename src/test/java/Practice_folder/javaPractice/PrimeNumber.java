package Practice_folder.javaPractice;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println(isPrime(4));
        System.out.println(isPrime(2));
        System.out.println(isPrime(15));
        System.out.println(isPrime(1));
        System.out.println(isPrime(-44));
        System.out.println(isPrime(0));
        System.out.println(isPrime(7));


    }
    public static boolean isPrime (int X) {
        if (X <= 1){

            return false;

    }
        for(int i=2; i<=X/2; i++){
            if(X%i==0){
                return false;

            }
        }

        return true;
    }
}
