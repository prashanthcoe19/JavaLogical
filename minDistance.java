public class minDistance {
    public static void main(String[] args) {
        int number = 13013;
        minDis(number);
    }

    public static int minDis(int n) {
        int fact1 = 1;
        int fact2 = 0;
        int min = n;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                fact1 = 1;
                fact2 = 0;
            }
            count++;
            if (count > 1) {
                if (n % i == 0) {
                    fact2 = i;
                    if (fact2 - fact1 <= min) {
                        min = fact2 - fact1;
                        fact1 = fact2;
                    }
                }
            }
        }
        System.out.println(min);
        return 1;
    }
}
