public class meeraNumber {
    public static void main(String[] args) {
        int num = 21;
        ismeraNos(num);
    }

    public static int ismeraNos(int n) {
        int count = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (n % count == 0) {
            System.out.println("meeraNumber");
            return 1;
        }
        return 0;
    }
}
