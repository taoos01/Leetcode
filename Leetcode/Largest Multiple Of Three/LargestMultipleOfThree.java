// 1363. Largest Multiple of Three
// https://leetcode.com/problems/largest-multiple-of-three/?envType=problem-list-v2&envId=array

// Given an array of digits digits, return the largest multiple of three that can be formed by concatenating some of the given digits in any order. If there is no answer return an empty string.

// Since the answer may not fit in an integer data type, return the answer as a string. Note that the returning answer must not contain unnecessary leading zeros.

// Example 1:
// Input: digits = [8,1,9]
// Output: "981"

// Example 2:
// Input: digits = [8,6,7,1,0]
// Output: "8760"

// Example 3:
// Input: digits = [1]
// Output: ""

import java.util.Arrays;

public class LargestMultipleOfThree{
    public static void main(String[] args){
        int[] nums = {8,6,7,1,0};
        // System.out.print(Arrays.toString(sortingDescending(nums)));
        System.out.print(multipleOfThree(nums));
    }
    
    // public static String largestMultipleOfThree(int[] digits) {
        
    //     return "x";   
    // }

    public static int divisibleByThree(int[] nums){
        int n = merging(nums);
        while(n > 0){
            int rem = n  / 10;
            if(rem % 3 == 0){
                return rem;
            }
            
        }
        return 0;
    }

    public static int merging(int[] nums){
        sortingDescending(nums);
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            ans = ans * 10 + nums[i];
        }
        return ans;
    }
    
    public static int[] sortingDescending(int[] nums){
        for(int i = 0; i < nums.length; i++){
            for(int j = 1; j < nums.length; j++){
                if(nums[j] > nums[j - 1]){
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
        return nums;
    }
}