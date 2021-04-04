public class bunker2 {
    public static void main(String[] args) {
        int[] arr = { 6, 10, 1 };
        isBunker2(arr);
    }

    public static int isBunker2(int[] arr) {
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == 1 & isPrime(arr[j]) == 1) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                break;
            }
        }
        if (flag == 1) {
            System.out.println("bunker");
        }
        return 0;
    }

    public static int isPrime(int n) {
        int flag = 0;
        if (n < 2)
            flag = 1;
        for (int j = 2; j < n / 2; j++) {
            if (n % j == 0) {
                flag = 1;
            }
        }
        if (flag == 0)
            return 1;
        return 0;
    }
}
