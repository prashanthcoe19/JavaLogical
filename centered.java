/* 
An array with an odd number of elements is said to be centered if all elements (except the middle one) 
are strictly greater than the value of the middle element. 
Note that only arrays with an odd number of elements have a middle element. 
Write a function that accepts an integer array and returns 1 if it is a centered array, 
otherwise it returns 0.
*/

public class centered {

    public static int arr(int[] a) {
        System.out.println(a.length);
        if (a.length == 0 || a.length % 2 == 0) {
            return 0;
        }
        int mid = a.length / 2;
        int cvalue = a[mid];
        System.out.println(cvalue);
        for (int i = 0; i < a.length; i++) {
            if (i != mid && cvalue >= a[i]) {
                // System.out.println("not centered");
                return 0;
            }
        }
        // System.out.println("centered");
        return 1;
    }

    public static void main(String[] args) {
        int[] a = { 3, 2, 1, 4, 5 };
        arr(a);
    }
}
