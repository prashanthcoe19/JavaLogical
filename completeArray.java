/*
An array is defined to be complete if the conditions (a), (d) and (e) below hold.
  a. The array contains even numbers
  b. Let min be the smallest even number in the array.
  c. Let max be the largest even number in the array.
  d. min does not equal max
  e. All numbers between min and max are in the array

For example {-5, 6, 2, 3, 2, 4, 5, 11, 8, 7} is complete because 
  a. The array contains even numbers
  b. 2 is the smallest even number
  c. 8 is the largest even number
  d. 2 does not equal 8
  e. the numbers 3, 4, 5, 6, 7 are in the array.

Examples of arrays that are not complete are:
{5, 7, 9, 13} condition (a) does not hold, there are no even numbers.
{2, 2} condition (d) does not hold
{2, 6, 3, 4} condition (e) does not hold (5 is missing)

Write a function named isComplete that returns 1 if its array argument is a complete array. Otherwise it returns 0.

If you are writing in Java or C#, the function signature is
   int isComplete (int[ ] a)

If you are writing in C or C++, the function signature is
   int isComplete (int a[ ], int len) where len is the number of elements in the array.

*/

public class completeArray {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 3, 4 };
        isEven(arr);
    }

    public static int isComplete(int[] arr, int e1, int e2) {
        int count = 0;
        for (int j = e1 + 1; j < e2; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (j == arr[i]) {
                    count++;
                    break;
                }
            }
        }
        if (count == (e2 - e1 - 1)) {
            System.out.println("Complete Array");
            return 1;
        }
        System.out.println("Not Complete Array");
        return 0;
    }

    public static int isEven(int[] arr) {
        int e1 = 2;
        int e2 = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (count == 0) {
                    /* only runs until and only when first even nos in array is found */
                    if (arr[i] > e1) {
                        e2 = arr[i];
                        count++;
                    }
                }
                /* runs when first even nos in array is found */
                if (count == 1) {
                    e2 = e2 > arr[i] ? e2 : arr[i];
                }
            }
        }
        System.out.println(e2);
        System.out.println(e1);
        if (count > 0) {
            isComplete(arr, e1, e2);
        }
        return 0;
    }
}
