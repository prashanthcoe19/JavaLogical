public class fibonacci {
    public static void main(String[] args) {
        int n = 14;
        isFibonacci(n);
    }

    public static int isFibonacci(int n) {
        int flag = 0;
        int f1 = 1, f2 = 1, n1 = 0;
        while (n1 <= n) {
            n1 = f1 + f2;
            if (n1 == n) {
                flag = 1;
                break;
            }
            f1 = f2;
            f2 = n1;
        }
        if (flag == 1) {
            System.out.println("yes");
            return 1;
        }
        System.out.println("no");
        return 0;
    }
}
