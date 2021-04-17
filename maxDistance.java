/* 
Write a function named maxDistance that returns the largest distance between 
two non -trivial factors of a number. For example, consider 1001 = 7*11*13. 
Its non-trivial factors are 7, 11 , 13, 77, 91, 143. 
Note that 1 and 1001 are trivial factors. maxDistance(1001) 
would return 136 because the largest distance between 
any two non-trivial factors is 136 (143- 7 = 136). 

*/

public class maxDistance {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(ismaxDist(n));
    }

    public static int ismaxDist(int n) {
        int f1 = 0, f2 = 0, max = 0, flag = 0, count = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (count == 0) {
                if (n % i == 0) {
                    f1 = i;
                    count++;
                    flag = 1;
                }
            }
            if (count == 1) {
                if (n % i == 0) {
                    f2 = i;
                    if (f2 - f1 >= max) {
                        max = f2 - f1;
                    }
                }
            }
        }
        if (flag == 0)
            return -1;
        return max;
    }

}
