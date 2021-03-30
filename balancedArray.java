public class balancedArray {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 3, 6 };
        balanced(arr);
    }

    public static int balanced(int[] arr) {
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != i % 2) {
                flag++;
            }
        }
        if (flag > 0) {
            System.out.println("not balanced");
            return 0;
        }
        System.out.println("balanced");
        return 1;
    }
}
