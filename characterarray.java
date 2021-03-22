/* 
Write a function that accepts a character array, a zero-based start position and a length. 
It should return a character array containing containing lengthcharacters starting with the start
character of the input array. 
The function should do error checking on the start position and the length and return null 
if the either value is not legal.
The function signature is:
char[ ] f(char[ ] a, int start, int len)

*/

public class characterarray {

    public static char[] f(char[] a, int start, int len) {
        char[] b = new char[len];
        if (start < 0 || len < 0 || start + len > a.length) {
            // System.out.println("Error");
            return null;
        }
        int i = start;
        int j;
        for (j = 0; j < a.length; j++) {
            b[j] = a[i];
            i++;
        }
        // System.out.println(Arrays.toString(b));
        return b;

    }

    public static void main(String[] args) {
        char[] a = { 'a', 'b', 'c' };
        int start = 0;
        int length = 4;
        f(a, start, length);
    }
}
