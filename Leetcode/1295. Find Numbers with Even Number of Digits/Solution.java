// 1295. Find Numbers with Even Number of Digits
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

// Given an array nums of integers, return how many of them contain an even number of digits.
// Example 1:
// Input: nums = [12,345,2,6,7896]
// Output: 2
// Explanation: 
// 12 contains 2 digits (even number of digits). 
// 345 contains 3 digits (odd number of digits). 
// 2 contains 1 digit (odd number of digits). 
// 6 contains 1 digit (odd number of digits). 
// 7896 contains 4 digits (even number of digits). 
// Therefore only 12 and 7896 contain an even number of digits.

// Example 2:
// Input: nums = [555,901,482,1771]
// Output: 1 
// Explanation: 
// Only 1771 contains an even number of digits.
 
public class Solution {
    public static void main(String[] args) {
        int[] nums = {-12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }   
    
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(digits(nums[i]) % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static int digits(int num){
        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        // No of digits in a number. 
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}
