package BitManipulation;

/*
 191. Number of 1 Bits
Write a function that takes the binary representation of an unsigned integer and returns the number of '1' bits
 it has (also known as the Hamming weight).
Input: n = 00000000000000000000000000001011
Output: 3
Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.
 */
public class Leetcode_191 {
    public static void main(String[] args) {
        System.out.println(numberOfOne(00000000000000000000000000001011));
    }

    public static int numberOfOne(int n){
        int count = 0;
        int bit = 1;
        while(n!=0){
            bit = (n&1);
            if(bit==1){
                count++;
            }
            n = n >> 1;
            // Another approach:
            // n = n & (n-1);
            // count++;
        }
        return count;
    }
}
