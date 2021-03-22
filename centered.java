public class centered {

    public static int arr(int[] a) {
        System.out.println(a.length);
        if (a.length % 2 == 0) {
            return 0;
        }
        int mid = a.length / 2;
        int cvalue = a[mid];
        System.out.println(cvalue);
        for (int i = 0; i < a.length; i++) {
            if (i != mid && cvalue >= a[i]) {
                // System.out.println("not centered");
                return 0;
            }
        }
        // System.out.println("centered");
        return 1;
    }

    public static void main(String[] args) {
        int[] a = { 3, 2, 1, 4, 5 };
        arr(a);
    }
}
