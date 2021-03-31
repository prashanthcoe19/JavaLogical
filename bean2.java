public class bean2 {
    public static void main(String[] args) {
        int[] arr = { 9, 6, 18 };
        isBean(arr);
    }

    public static int isBean(int[] arr) {
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 9) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == 13) {
                        flag++;
                    }
                }
            }
            if (arr[i] == 7) {
                for (int k = 0; k < arr.length; k++) {
                    if (arr[k] == 16) {
                        break;
                    }
                    flag++;
                }
            }

        }
        if (flag > 0) {
            System.out.println("beanArray");
        }
        return 0;
    }
}
