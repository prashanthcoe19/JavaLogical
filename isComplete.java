public class isComplete {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 4, 4, 4, 6, 7, 9, 8, 10, 11, 12, 14 };
        isComarray(arr);
    }

    public static int isComarray(int[] a) {
        int e1 = 0, count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) {
                return 0;
            }
            if (a[i] % 2 == 0) {
                e1 = a[i] > e1 ? a[i] : e1;
            }
        }
        for (int j = 2; j < e1; j += 2) {
            for (int k = 0; k < a.length; k++) {
                if (j == a[k]) {
                    count++;
                    break;
                }
            }
        }
        if (count == (e1 - 2) / 2) {
            System.out.println("complete");
            return 1;
        }
        System.out.println("no complete");
        return 0;
    }
}
