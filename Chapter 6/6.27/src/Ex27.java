
public class Ex27 {
	
    public static void main(String[] args) {
        final int NUMBER_OF_EMIRPS = 100;
        final int EMIRPS_PER_LINE = 10;

        int count = 0;
        int n = 2;

        while (count < NUMBER_OF_EMIRPS) {
            if (isEmirp(n)) {
                count++;
                System.out.print(count % EMIRPS_PER_LINE == 0 ? n + "\n" : n + " ");
            }
            n++;
        }
    }

    public static boolean isEmirp(int num) {
        return PrimeNumberMethod.isPrime(num) && !Ex3.isPalindrome(num) && PrimeNumberMethod.isPrime(Ex3.reverse(num));
    }
}