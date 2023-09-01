package BitManipulation;
/*
136. Single Number
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Input: nums = [2,2,1]
Output: 1

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
*/
public class Leetcode_136_SingleNumber {
    public static void main(String[] args) {
        //System.out.println(singleNum([1]));
    }   

    public static int singleNum (int[] nums){
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
