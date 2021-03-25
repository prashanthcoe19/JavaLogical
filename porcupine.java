public class porcupine {
    public static void main(String[] args) {
        int number = 419;
        findPorcupine(number);
    }

    public static int findPorcupine(int n) {
        int prime;
        while (true) {
            prime = nextPrime(n);
            int newPrime = prime;
            if (prime % 10 == 9) {
                newPrime = nextPrime(prime);
                if (newPrime % 10 == 9) {
                    System.out.println(newPrime);
                    return 1;
                }
            }
            n = newPrime;
        }
    }

    public static int nextPrime(int n) {
        int N = n + 1;
        while (true) {
            int flag = 0;
            for (int i = 2; i < N / 2; i++) {
                if (N % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                return N;
            }
            N++;
        }
    }
}