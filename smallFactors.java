public class smallFactors {
    public static void main(String[] args) {
        int k = 10;
        int n = 22;
        sFactors(k, n);
    }

    public static boolean sFactors(int k, int n) {
        int flag = 0;
        for (int i = 2; i < k; i++) {
            if ((n % i) == 0 & (n / i) < k) {
                flag++;
            }
        }
        if (flag > 0) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }
}
