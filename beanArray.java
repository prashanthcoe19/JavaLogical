/*
 * A Bean array is defined to be an array where for every value n in the array, there is also an element 
 * n-1 or n+1 in the array. 
	For example, {2, 10, 9, 3} is a Bean array because
	2 = 3-1
	10 = 9+1
	3 = 2 + 1
	9 = 10 -1
	
	Other Bean arrays include {2, 2, 3, 3, 3}, {1, 1, 1, 2, 1, 1} and {0, -1, 1}.
	
	The array {3, 4, 5, 7} is not a Bean array because of the value 7 which requires that the 
	array contains either the value 6 (7-1) or 8 (7+1) but neither of these values are in the array.

*/
public class beanArray {
    public static void main(String[] args) {
        int[] arr = { 2, 10, 9, 3 };
        if (bean(arr) == 1) {
            System.out.println("it is a bean array");
        } else {
            System.out.println("it is not a bean array");
        }
    }

    public static int bean(int[] a) {
        int l = a.length;
        int flag = 0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (i != j) {
                    if ((a[i] + 1 == a[j]) || a[i] - 1 == a[j]) {
                        flag++;
                    }
                }
            }
            if (flag == 0) {
                return 0;
            }
        }
        return 1;
    }
}
