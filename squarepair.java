public class squarepair {
    public static void main(String[] args) {
        int[] ar = { 9, 0, 2, -5, 7 };
        countSquarePairs(ar);
    }

    public static int countSquarePairs(int[] a) {
        System.out.println(a.length);
        if (a.length < 2)
            return 0;
        int sum;
        int count = 0;
        int[] na = new int[2];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                sum = a[i] + a[j];
                // System.out.println(sum);
                if (perfectSquare(sum) == 1) {
                    if (a[i] < a[j] & a[i] > 0 & a[j] > 0) {
                        // System.out.println("match");
                        count = count + 1;
                        na[k] = i;
                        System.out.println(a[i] + " " + a[j] + " ");
                    }
                }
            }
        }
        System.out.println(count);
        // System.out.println(na.length);
        return count;
    }

    public static int perfectSquare(int b) {
        double sqrrt = Math.sqrt(b);
        if (sqrrt - Math.floor(sqrrt) == 0) {
            // System.out.println("yes perfect square");
            return 1;
        } else {
            // System.out.println("no not perfect square");
            return 0;
        }
    }
}
