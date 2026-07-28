class Solution {
    public int[] getConcatenation(int[] nums) {

        //create an array 
       int [] ans = new int[2*nums.length];

        //traversing for first 3 element
       for(int i = 0; i < nums.length; i++) {
        ans[i] = nums[i];
       }
       //taversing for next 3 element
       for(int i = 0; i < nums.length; i++) {
        ans[i+nums.length] = nums[i];
       }

       //returning array ans
       return ans;
    }
}