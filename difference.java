/* 
Write a function that takes an array of integers as an argument and returns a value based on the sums 
of the even and odd numbers in the array. 
Let X = the sum of the odd numbers in the array and let Y = the sum of the even numbers. 
The function should return X – Y
The signature of the function is:
int f(int[ ] a)
*/
public class difference {
    public static int arr(int[] a) {
        int eSum = 0;
        int oSum = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                eSum = eSum + a[i];
            } else {
                oSum = oSum + a[i];
            }
        }
        System.out.println(oSum - eSum);
        return oSum - eSum;
    }

    public static void main(String[] args) {
        int[] a = { 3, 2, 3, 4 };
        arr(a);
    }
}
