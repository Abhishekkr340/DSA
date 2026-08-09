class Solution {
    public int findNumbers(int[] nums) {
       
        int count2 = 0;
        for(int i =0; i<nums.length;i++){
            int a = nums[i];
            int count1 = String.valueOf(Math.abs(a)).length();
            if(count1%2==0){
                count2++;
            }
        }
        return count2;
    }
}