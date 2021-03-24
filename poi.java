public class poi {
    public static void main(String[] args) {
        int[] a = { 2, 1, 1, 1, 2, 1, 7 };
        arr(a);
    }

    public static int arr(int[] a) {
        if (a.length < 3)
            return -1;
        int sum = 0;
        int leftSum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        for (int i = 0; i < a.length; i++) {
            sum = sum - a[i];

            if (leftSum == sum) {
                System.out.println(i);
                return 1;
            }
            leftSum += a[i];
        }
        return -1;
    }
}
