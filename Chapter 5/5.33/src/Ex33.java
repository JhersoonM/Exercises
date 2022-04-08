/*
(Perfect number) A positive integer is called a perfect number if it is equal to
<<<<<<< HEAD
the sum of all of its positive divisors, excluding itself. For example, 6 is the
first perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1. 
There are four perfect numbers less than 10,000. Write a program to find all
=======
the sum of all of its positive divisors, excluding itself. For example, 6 is the first
perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2
+ 1. There are four perfect numbers less than 10,000. Write a program to find all
>>>>>>> f7c770b17f3c46acc01e28b1b7c3742d6c7130d0
these four numbers.
*/
public class Ex33 {
    public static void main(String[] args) {

        System.out.println("The four perfect number less than 10,000:");

        int sum;

        for (int i = 1; i < 10000; i++) {
            sum = 0;

            for (int k = 1; k < i; k++) {

                if (i % k == 0) {
                    sum += k;
                }
            }

            if (i == sum) {
                System.out.printf("%20d\n", i);
            }
        }
    }
}