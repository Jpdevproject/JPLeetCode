package closestsum;

import java.util.Arrays;

/*
You are given an integer array nums of length n and an integer target.

Find three integers at distinct indices in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.



Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
Example 2:

Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).


Constraints:

3 <= nums.length <= 500
-1000 <= nums[i] <= 1000
-104 <= target <= 104
 */
public class ClosestThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};int  target = 1;
        int closestSum=solveClosestThreeSum(nums,target);
        System.out.println(closestSum);
    }

    private static int solveClosestThreeSum(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int closestSum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(closestSum-target)>Math.abs(sum-target)){
                    closestSum=sum;
                }
                if(sum<target){
                    j++;
                } else if (sum>target) {
                    k--;
                }else
                    return sum;
            }
        }
        return closestSum;
    }
}
