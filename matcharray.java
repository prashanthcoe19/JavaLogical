/* 
Write a function to return an array containing all elements common to two given arrays containing distinct 
positive integers. 
You should not use any inbuilt methods. 
You are allowed to use any number of arrays.
The signature of the function is:
int[] f(int[] first, int[] second)
*/

public class matcharray {
    public static int[] f(int[] first, int[] second) {
        if (first == null || second == null)
            return null;
        if (first.length == 0 || second.length == 0)
            return new int[0];

        int min = (first.length > second.length) ? second.length : first.length;
        int a[], b[];
        if (min == first.length) {
            a = first;
            b = second;
        } else {
            a = second;
            b = first;
        }
        int[] na = new int[min];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    na[k] = a[i];
                    k++;
                }
            }
        }
        int[] returnArray = new int[k];
        for (int t = 0; t < returnArray.length; t++) {
            returnArray[t] = na[t];
            System.out.print(returnArray[t] + " ");
        }
        return returnArray;
    }

    public static void main(String[] args) {
        int[] first = { 1, 2, 3, 4 };
        int[] second = { 5, 6, 1, 2 };
        f(first, second);
    }
}
