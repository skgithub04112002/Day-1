class Solution {
    public int removeDuplicates(int[] nums) {
        int len=nums.length,x=0;
        for(int i=0;i<len-1;++i){
            if(nums[i]!=nums[i+1]){
                nums[x++]=nums[i];
            }
        }
        nums[x++]=nums[len-1];
        return x;
    }
