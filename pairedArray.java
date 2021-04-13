public class pairedArray {
    public static void main(String[] args) {
        int[] a = { 7, 15, 9, 2, 3 };
        isPaired(a);
    }

    public static int isPaired(int[] a) {
        int flag = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != i % 2) {
                flag = 1;
            } else {
                flag = 0;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("yes");
            return 1;
        }
        System.out.println("no");
        return 0;
    }
}
