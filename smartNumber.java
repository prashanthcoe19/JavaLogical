/* 

An integer is defined to be a Smart number if it is an element
 in the infinite sequence 1, 2, 4, 7, 11, 16 … 
 Note that 2-1=1, 4-2=2, 7-4=3, 11-7=4, 16-11=5 so for k>1, 
 the kth element of the sequence is equal to the k-1th element + k-1. 
For example, for k=6, 16 is the kth element and is equal to 11 
(the k-1th element) + 5 ( k-1).

*/

public class smartNumber {
    public static void main(String[] args) {
        long number = 3;
        isSmart(number);
    }

    static int isSmart(long n) {
        int smart = 1;
        for (int i = 0; smart < n; i++) {
            smart = smart + i;
        }
        if (smart == n) {
            System.out.println("Smart");
            return 1;
        }
        return 0;
    }
}
