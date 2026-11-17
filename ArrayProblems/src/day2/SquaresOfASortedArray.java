package day2;
/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.



Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]


Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.
 */

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] ans=square(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] square(int[] nums) {
        int n=nums.length;
        int left=0,right=n-1,k=n-1;
        int[] res=new int[n];
        while (left<=right){
            int leftSquare=nums[left]*nums[left];
            int rightSquare=nums[right]*nums[right];
            if(leftSquare>rightSquare){
                res[k--]=leftSquare;
                left++;
            }else {
                res[k--]=rightSquare;
                right--;
            }
        }
        return res;
    }
}
