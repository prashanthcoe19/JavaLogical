public class oddHeavy {
    public static void main(String[] args) {
        int[] a = { 41, 4, 31, 2, 20 };
        isOddHeavy(a);
    }

    public static int isOddHeavy(int[] a) {
        int flag = 0;

        if (a.length == 0)
            return 0;
        if (a.length == 1 & a[0] % 2 == 0)
            return 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                for (int j = 0; j < a.length; j++) {
                    if (a[j] % 2 == 0) {
                        if (a[i] < a[j]) {
                            flag = 1;
                            break;
                        }
                    }
                }
                if (flag == 1) {
                    break;
                }
            }
        }
        if (flag == 1) {
            System.out.print("no");
            return 0;
        }
        System.out.println("yes");
        return 1;
    }
}
