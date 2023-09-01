package BitManipulation;
/*
338. Counting Bits
Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's 
in the binary representation of i.

Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10

Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101
*/
public class Leetcode_338_CountingBits {
    public static void main(String[] args) {
        System.out.println(countBits(4));
    }

    public static int[] countBits(int n){
        int[] t = new int[n+1];
        t[0] = 0;
        for(int i=1;i<=n;i++){
            // Used dynamic programming
            t[i] = t[i/2] + i%2;
        }
        return t;
    }
}
