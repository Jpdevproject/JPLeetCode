package day2;
/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.



Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]


Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
 */

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
       int[] nums = {0,1,0,3,12};
       int[] ans=moveZero(nums);
       System.out.println(Arrays.toString(ans));
    }

    private static int[] moveZero(int[] nums) {
        int n=nums.length;
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[k]=nums[i];
                k++;
            }
        }
        while(k<n){
            nums[k++]=0;
        }
        return nums;
    }
}
