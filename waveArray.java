public class waveArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 6 };
        isWave(arr);
    }

    public static int isWave(int[] arr) {
        int l = arr.length;
        int flag = 0;
        for (int i = 0; i < l - 1; i++) {
            if (arr[i] % 2 == 0 & arr[i + 1] % 2 == 0) {
                System.out.println("not a wave array");
                flag++;
                break;
            }
            if (arr[i] % 2 != 0 & arr[i + 1] % 2 != 0) {
                System.out.println("not a wave array");
                flag++;
                break;
            }
        }
        if (flag > 0)
            return 0;
        System.out.println("yes a wave array");
        return 1;
    }
}
