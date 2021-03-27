/* 

1. An Evens number is an integer whose digits are all even. For example 2426 is an Evens number but 3224 is not.

Write a function named isEvens that returns 1 if its integer argument is an Evens number otherwise it returns 0.

The function signature is
   int isEvens (int n)

*/

public class evens {
    public static void main(String[] args) {
        int number = 2443;
        isEvens(number);
    }

    public static int isEvens(int n) {
        int flag = 0;
        int rem;
        while (n != 0) {
            rem = n % 10;
            if (rem % 2 != 0) {
                break;
            }
            n = n / 10;
            flag++;
        }
        if (flag > 0) {
            System.out.println("is evens");
            return 1;
        }
        System.out.println("no evens");
        return 0;
    }
}
