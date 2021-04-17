public class fancyArray {
    public static void main(String[] args) {
        int n = 17;
        System.out.println(isFancy(n));
    }

    public static int isFancy(int n) {
        int n1 = 1, n2 = 1, f = 0;
        while (f < n) {
            f = 2 * n1 + 3 * n2;
            n1 = n2;
            n2 = f;
        }
        System.out.println(f);
        if (f == n)
            return 1;
        return 0;
    }
}
