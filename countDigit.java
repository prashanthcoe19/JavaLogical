public class countDigit {
    public static void main(String[] args) {
        int num = 6666;
        int r = 6;
        digitCount(num, r);
    }

    public static int digitCount(int n, int r) {
        int count = 0;
        int rem;
        if (n < 0)
            return -1;
        while (n != 0) {
            rem = n % 10;
            if (rem == r) {
                count++;
            }
            n = n / 10;
        }
        if (count > 0) {
            System.out.println(count);
            return 1;
        }
        return 0;
    }
}
