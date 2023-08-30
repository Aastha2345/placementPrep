package BitManipulation;

/*
476. Number Complement and 
1009. Complement of Base 10 Integer
The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.
For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
Given an integer num, return its complement.
Input: num = 5
Output: 2
Explanation: 
The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
*/

public class Leetcode_476 {
    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }

        public static int findComplement(int num) {
            int mask = 1;
            while((mask&num)!=num){
                mask = mask<<1;
                mask += 1;  // added to add 1 at the last cz otherwise it will add 0 as padding at the end
            }
            return (num ^ mask);
        }
}
