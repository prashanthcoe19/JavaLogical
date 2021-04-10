public class magicArray {
    public static void main(String[] args) {
        int[] arr = { 12, 4, 4, 4, 4 };
        magic(arr);
    }

    public static int magic(int[] a) {
        int sum = 0;
        for (int i = 1; i < a.length; i++) {
            if (isPrime(a[i]) == 1) {
                sum = sum + a[i];
            }
        }
        if (a[0] == sum || (a[0] == 0 & sum == 0) || (isPrime(a[0]) == 1 & sum == 0)) {
            System.out.println("Magic Array");
            return 1;
        }
        return 0;
    }

    public static int isPrime(int n) {
        int flag = 0;
        if (n < 0)
            return 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            return 1;
        }
        return 0;
    }

}