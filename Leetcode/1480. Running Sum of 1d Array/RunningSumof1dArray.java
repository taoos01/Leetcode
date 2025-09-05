// https://leetcode.com/problems/running-sum-of-1d-array/submissions/1760768249/

// 1480. Running Sum of 1d Array
// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

// Return the running sum of nums.

// Example 1:
// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

// Example 2:
// Input: nums = [1,1,1,1,1]
// Output: [1,2,3,4,5]
// Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

// Example 3:
// Input: nums = [3,1,2,10,1]
// Output: [3,4,6,16,17]
import java.util.Arrays;

public class RunningSumof1dArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        System.out.print(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(i > 0){
                nums[i] = nums[i] + nums[i- 1];
                continue;
            }
            nums[i] = nums[i];
        }      
        return nums;
    }

}
