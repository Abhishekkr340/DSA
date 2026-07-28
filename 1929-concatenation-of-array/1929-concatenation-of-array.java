class Solution {
    public int[] getConcatenation(int[] nums) {

        //create an array 
       int [] ans = new int[2*nums.length];

        //traversing array nums
       for(int i = 0; i < nums.length; i++) {
        ans[i] = nums[i];
       }
       for(int i = 0; i < nums.length; i++) {
        ans[i+nums.length] = nums[i];
       }
       return ans;
    }
}