/*
Let us define two arrays as “set equal” if every element in one is also 
in the other and vice-versa. 
For example, any two of the following are equal to one another: 
{1, 9, 12}, {12, 1, 9}, {9, 1, 12, 1}, {1, 9, 12, 9, 12, 1, 9}. 
Note that {1, 7, 8} is not set equal to {1, 7, 1} or {1, 7, 6}.   

Write a function named isSetEqual(int[ ] a, int[ ] b) 
that returns 1 if its array arguments are set equal, 
otherwise it returns 0. 
*/

public class equalArray {
    public static void main(String[] args) {
        int[] a = { 1, 9, 1, 7, 8 };
        int[] b = { 1, 9, 1, 7, 8, 0 };
        isSetEqual(a, b);
    }

    public static int isSetEqual(int[] a, int[] b) {
        int flag = 0;
        int[] x;
        int[] y;
        int al = a.length;
        int bl = b.length;
        if (al > bl) {
            x = a;
            y = b;
        } else {
            x = b;
            y = a;
        }
        System.out.println(x.length);
        System.out.println(y.length);
        for (int i = 0; i < x.length; i++) {
            flag = 0;
            for (int j = 0; j < y.length; j++) {
                if (x[i] == y[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                break;
            }
        }
        if (flag == 0) {
            System.out.println("no Equal");
            return 0;
        }
        System.out.println("Equal");
        return 1;
    }
}
