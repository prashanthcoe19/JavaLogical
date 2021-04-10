public class smallFactors {
    public static void main(String[] args) {
        int k = 11;
        int n = 22;
        sFactors(k, n);
    }

    public static boolean sFactors(int k, int n) {
        int flag = 0;
        int u = 1, v = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0 & i < k) {
                u = v;
                v = i;
                if (u * v == n) {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 1) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }
}
