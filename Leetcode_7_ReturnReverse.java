/*
7. Reverse Integer
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside 
the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
Input: x = 123
Output: 321

Input: x = -123
Output: -321
*/

public class Leetcode_7_ReturnReverse {
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

    public static int reverse(int x){
        int reversed = 0;
        while(x!=0){
            int rem = x % 10;
            if(reversed>Integer.MAX_VALUE || reversed<Integer.MIN_VALUE){
                return 0;
            }
            reversed = (reversed * 10) + rem;
        }
        return reversed;
    }
}
