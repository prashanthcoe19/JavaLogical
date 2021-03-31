/*
An array is said to be hollow if it contains 3 or more zeroes in the middle that are preceded 
and followed by the same number of non-zero elements. 
Write a function named isHollow that  accepts an integer array and returns 1 if it is a hollow array, 
otherwise it returns 0

Examples:  isHollow({1,2,4,0,0,0,3,4,5}) returns 1.  
isHollow ({1,2,0,0,0,3,4,5}) returns 0. isHollow ({1,2,4,9, 0,0,0,3,4, 5}) returns 0.  
isHollow ({1,2, 0,0, 3,4}) returns 0.
*/

public class hollowArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 0, 0, 0, 0, 3, 4, 5, 6 };
        func(array);
    }

    public static int func(int[] arr) {
        int numCount = 0;
        int numCount1 = 0;
        int zeroCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                numCount++;
            } else {
                break;
            }
        }
        for (int j = numCount; j < arr.length; j++) {
            if (arr[j] == 0) {
                zeroCount++;
            } else {
                break;
            }
        }
        if (numCount != zeroCount || zeroCount < 3) {
            System.out.println("not hollow");
            return 0;
        }

        int x = numCount + zeroCount;
        for (int y = x; y < arr.length; y++) {
            if (arr[y] > 0) {
                numCount1++;
            } else {
                break;
            }
        }
        if (numCount == numCount1) {
            System.out.println("hollow");
            return 1;
        }
        System.out.println("not hollow");
        return 0;
    }
}