class Solution {
    public int[] runningSum(int[] nums) {

        for(int i = 1; i<=nums.length-1; i++) {
            int a = nums[i]+nums[i-1];
            nums[i] = a;
        }
        return nums;
        
    }
}