/*
An Sub array is defined to be an array in which each element is greater than sum of all elements after that. See examples below:
 
{13, 6, 3, 2} is a Sub array. Note that 13 > 2 + 3 + 6, 6 > 3 + 2, 3 > 2.
 
{11, 5, 3, 2} is a NOT a Sub array. Note that 5 is not greater than 3 + 2.
 
Write a function named isSub that returns 1 if its array argument is a Sub array, otherwise it returns 0.

*/

public class subArray {
    public static void main(String[] args) {
        int[] a = { 11, 5, 3, 2 };
        isSub(a);
    }

    public static int isSub(int[] a) {
        int sum = 0;
        int flag = 0;
        for (int i = 0; i < a.length; i++) {
            sum = 0;
            for (int j = i + 1; j < a.length; j++) {
                sum = sum + a[j];
            }
            if (sum >= a[i]) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("isSub");
            return 1;
        }
        System.out.println("notSub");
        return 0;
    }
}
