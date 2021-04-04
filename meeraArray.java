public class meeraArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 7, 20 };
        isMeera(arr);
    }

    public static int isMeera(int[] arr) {
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == 2 * arr[j]) {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0) {
            System.out.println("meera");
        }
        return 0;
    }
}
