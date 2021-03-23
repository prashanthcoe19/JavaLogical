/* 
Write a function to reverse an integer using numeric operators and without using any arrays or 
other data structures.
The signature of the function is:
int f(int n)
*/

public class reverse {
    public static int r(int number) {
        int revNum = 0;
        int rem;
        while (number != 0) {
            rem = number % 10;
            revNum = revNum * 10 + rem;
            number /= 10;
        }
        System.out.println(revNum);
        return revNum;
    }

    public static void main(String[] args) {
        int n = -123;
        r(n);
    }
}
