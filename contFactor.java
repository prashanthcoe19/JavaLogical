public class contFactor {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int n = 90;
        isContinuous(n);
    }

    public static int isContinuous(int n) {
        int product = 1;
        int i = 2;
        int j = i;
        while (n % product == 0) {
            product = product * j;
            if (product == n) {
                break;
            }
            if (n % product != 0) {
                j = i;
                i = j + 1;
                product = 1;
            }
            j++;
            if (j > n / 2) {
                break;
            }
        }
        if (product == n) {
            System.out.println(product);
            return 1;
        }
        System.out.println(product);
        return 0;
    }
}
