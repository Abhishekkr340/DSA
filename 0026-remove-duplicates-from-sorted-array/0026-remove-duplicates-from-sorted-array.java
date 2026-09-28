class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        int first = 0;
        for(int second = 1;second<nums.length;second++){
            if(nums[first] != nums[second]){
                first++;
                nums[first] = nums[second];
            }
        }

        return first+1;
        
    }
}