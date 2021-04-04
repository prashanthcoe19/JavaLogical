public class bunkerArray {
    public static void main(String[] args) {
        int[] arr = { 4, 9, 6, 15, 21 };
        isBunker(arr);
    }

    public static int isBunker(int[] arr) {
        int flag = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != 0) {
                if (isPrime(arr[i + 1]) == 1) {
                    flag = 1;
                }
            }
        }
        if (flag == 1) {
            System.out.println("isBunker");
            return 1;
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
