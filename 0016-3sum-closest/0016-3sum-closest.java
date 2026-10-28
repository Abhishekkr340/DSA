import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int bestSum = nums[0] + nums[1] + nums[2];
        int n = nums.length;
        
        for (int i = 0; i < n - 2; i++) {
            
            int start = i + 1;
            int end = n - 1;
            
            while (start < end) {
                int currentSum = nums[i] + nums[start] + nums[end];
                
                if (currentSum == target) {
                    return currentSum;
                }
                
                if (Math.abs(currentSum - target) < Math.abs(bestSum - target)) {
                    bestSum = currentSum;
                }
                
                if (currentSum < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        
        return bestSum;
    }
}
