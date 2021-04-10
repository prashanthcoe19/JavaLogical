/*
Two integers are defined to be factor equal, if they have the same number of factors. 
For example, integers 10 and 33 are factor equal because, 
10 has four factors: 1, 2, 5, 10 and 33 also has four factors: 
1, 3, 11, 33. On the other hand, 9 and 10 are not factor equal since 9 
has only three factors: 
1, 3, 9 and 10 has four factors: 1, 2, 5, 10.

Write a function named factorEqual(int n, int m) that returns 1 if n and m are factor equal and 0 otherwise.

The signature of the function is
   int factorEqual(int n, int m)


*/

public class factorEqual {
    public static void main(String[] args) {
        int a = 10;
        int b = 33;
        isFactorEqual(a, b);
    }

    public static int isFactorEqual(int n, int m) {
        int count1 = 0, count2 = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count1++;
            }
        }
        for (int j = 1; j <= m; j++) {
            if (m % j == 0) {
                count2++;
            }
        }
        if (count1 == count2) {
            System.out.println("eqal");
            return 1;
        }
        return 0;
    }
}
