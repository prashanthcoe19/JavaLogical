/*

1. An integer array is said to be evenSpaced, if the difference between the largest value 
and the smallest value is an evennumber. 
Write a function isEvenSpaced(int[] a) that will return 1 if it is evenSpaced and 0 otherwise. 
If array has less than two elements, function will return 0. 
If you are programming in C or C++, the function signature is:
*/

public class evenSpaced {
    public static void main(String[] args) {
        int[] arr = { 200, 1500, 160, -150 };
        isEvenSpaced(arr);
    }

    public static int isEvenSpaced(int a[]) {
        int small = a[0];
        int big = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > big) {
                big = a[i];
            }
            if (a[i] < small) {
                small = a[i];
            }
        }
        System.out.println(small);
        System.out.println(big);
        if ((big - small) % 2 == 0) {
            System.out.println("evenSpaced");
            return 1;
        }
        System.out.println("noteven");
        return 0;
    }
}