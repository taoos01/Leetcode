// 2154. Keep Multiplying Found Values by Two
// https://leetcode.com/problems/keep-multiplying-found-values-by-two/description/ 

// You are given an array of integers nums. You are also given an integer original which is the first number that needs to be searched for in nums.
// You then do the following steps:
// If original is found in nums, multiply it by two (i.e., set original = 2 * original).
// Otherwise, stop the process.
// Repeat this process with the new number as long as you keep finding the number.
// Return the final value of original.

// Example 1:
// Input: nums = [5,3,6,1,12], original = 3
// Output: 24
// Explanation: 
// - 3 is found in nums. 3 is multiplied by 2 to obtain 6.
// - 6 is found in nums. 6 is multiplied by 2 to obtain 12.
// - 12 is found in nums. 12 is multiplied by 2 to obtain 24.
// - 24 is not found in nums. Thus, 24 is returned.

// Example 2:
// Input: nums = [2,7,9], original = 4
// Output: 4
// Explanation:
// - 4 is not found in nums. Thus, 4 is returned.
package Leetcode;
import java.util.Arrays;

public class KeepMultiplyingFoundValuesbyTwo {
    public static void main(String[] args){
        int[] nums = {8,19,4,2,15,3};
        int original = 2;
        System.out.print(findFinalValue(nums, original));
        System.out.println(Arrays.toString(sorting(nums)));
    }   

    public static int findFinalValue(int[] nums, int original) {
        // sorting(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == original){
                original = nums[i] * 2;
            }
        }
        return original;
    }

    // public static boolean isAvailable(int[] nums, int original){
    //     for(int i = 0; i < nums.length; i++){
    //         if(nums[i] == original){
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    public static int[] sorting(int[] nums){
        for(int i = 0 ; i < nums.length; i++){
            for (int j = 1; j < nums.length; j++) {
                if(nums[j] < nums[j - 1]){
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
        return nums;
    }

}
