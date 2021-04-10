/**
 * 
 * An isSym (even/odd Symmetric) array is defined to be an array in which even
 * numbers and odd numbers appear in the same order from “both directions”. You
 * can assume array has at least one element. See examples below:
 * 
 * {2, 7, 9, 10, 11, 5, 8} is a isSym array.
 * 
 * Note that from left to right or right to left we have even, odd, odd, even,
 * odd, odd, even.
 * 
 * {9, 8, 7, 13, 14, 17} is a isSym array.
 * 
 * Note that from left to right or right to left we have {odd, even, odd, odd,
 * even, odd}.
 * 
 * However, {2, 7, 8, 9, 11, 13, 10} is not a isSym array. From left to right we
 * have {even, odd, even, odd, odd, odd, even}. From right to left we have
 * {even, odd, odd, odd, even, odd, even}, whichis not the same.
 * 
 */
public class symArray {
    public static void main(String[] args) {
        int[] a = { 2, 7, 9, 9, 11, 5, 8 };
        isSym(a);
    }

    public static int isSym(int[] a) {
        int rtnValue = 0;
        int j = a.length - 1;
        for (int i = 0; i < j; i++) {
            if ((a[i] % 2 == 0 & a[j] % 2 == 0) || (a[i] % 2 != 0 & a[j] % 2 != 0)) {
                rtnValue = 1;
            } else {
                rtnValue = 0;
                break;
            }
            j--;
        }
        if (rtnValue == 1) {
            System.out.println("sym");
            return 1;
        }
        System.out.println("notsym");
        return 0;
    }
}
