/* 
A primeproduct is a positive integer that is the product of exactly two primes 
greater than 1. For example, 22 is primeproduct since 22 = 2 times 11 
and both 2 and 11 are primes greater than 1. 
Write a function named isPrimeProduct  with an integer parameter that 
returns 1 if the parameter is a primeproduct, otherwise it returns 0. 
Recall that a prime number is a positive integer with no factors other 
than 1 and itself. 
*/

public class primeProduct {
    public static void main(String[] args) {
        int num = 25;
        primepro(num);
    }

    public static int primepro(int n) {
        int product = 1;
        int count = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (isPrime(i) == 1) {
                if (n % i == 0) {
                    product = product * i;
                    count++;
                }
            }
        }
        if (count < 2) {
            product = product * product;
        }
        if (product == n) {
            System.out.println("PrimeProduct" + product + "Count" + count);
            return 1;
        }
        return 0;
    }

    public static int isPrime(int n) {
        int flag = 0;
        if (n <= 1)
            return 0;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            return 1;
        }
        return 0;
    }
}
