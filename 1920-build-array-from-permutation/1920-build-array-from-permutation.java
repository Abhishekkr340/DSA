class Solution {
    public int[] buildArray(int[] nums) {

        //create an array of size of nums
        int[] ans = new int[nums.length];

        //Traverse each index of nums
        for(int i =0; i<nums.length;i++) {

            //storing values in ans which are at the index of nums
            ans[i] = nums[nums[i]];
           
        }
        //returning the ans array
        return ans;
        
    }
}