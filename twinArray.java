/* 
Consider the prime number 11. Note that 13 is also a prime and 13 – 11 = 2. So, 11 and 13 are known as twin primes. Similarly, 29 and 31 are twin primes. So is 71 and 73. However, there are many primes for which there is no twin. Examples are 23, 67. A twin array is defined to an array which every prime that has a twin appear with a twin. Some examples are 
{3, 5, 8, 10, 27}, 	     // 3 and 5 are twins and both are present
{11, 9, 12, 13, 23},       // 11 and 13 are twins and both are present, 23 has no twin
{5, 3, 14, 7, 18, 67}.      // 3 and 5 are twins, 5 and 7 are twins, 67 has no twin

The following are NOT twin arrays:

{13, 14, 15, 3, 5} 	 // 13 has a twin prime and it is missing in the array
{1, 17, 8, 25, 67}     // 17 has a twin prime and it is missing in the array
*/

public class twinArray {
    public static void main(String[] args) {
        int[] arr = { 13, 3, 5 };
        isTwin(arr);
    }

    public static int isTwin(int[] a) {
        int flag = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (isPrime(a[i]) == 1 & isPrime(a[j]) == 1) {
                    if (isPrime(a[i] + 2) == 1 || isPrime(a[i] - 2) == 1) {
                        if (isPrime(a[j] + 2) == 1 || isPrime(a[j] - 2) == 1) {
                            if (a[i] + 2 == a[j] || a[i] - 2 == a[j]) {
                                System.out.println("Twin");
                            } else {
                                flag = 1;
                                break;
                            }
                        }
                    }

                }
            }
            if (flag == 1)
                break;
        }

        if (flag == 1)
            System.out.println("notTwin");
        if (flag == 0)
            System.out.println("twin");
        return 1;
    }

    public static int isPrime(int n) {
        int flag = 0;
        if (n < 2)
            flag = 1;
        for (int j = 2; j < n / 2; j++) {
            if (n % j == 0) {
                flag = 1;
            }
        }
        if (flag == 0)
            return 1;
        return 0;

    }
}
