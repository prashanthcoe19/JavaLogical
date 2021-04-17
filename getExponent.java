/* 

Write a method named getExponent(n, p) that returns the largest exponent x such that px evenly divides n. If p is <= 1 the method should return -1.

For example, getExponent(162, 3) returns 4 because 162 = 21 * 34, therefore the value of x here is 4. 

The method signature is
int getExponent(int n, int p)


*/

public class getExponent {
    public static void main(String[] args) {
        int n = -280;
        int p = 7;
        System.out.println(getExp(n, p));
    }

    public static int getExp(int n, int p) {
        int count = 0;
        if (n < 0) {
            n = -n;
        }
        if (p <= 1)
            return -1;

        while (n > 1) {
            if (n % p == 0) {
                count++;
                n = n / p;
            } else {
                break;
            }
        }
        return count;
    }
}
