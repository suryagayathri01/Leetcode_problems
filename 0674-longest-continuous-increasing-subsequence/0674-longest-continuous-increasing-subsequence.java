class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count=1,max=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]<=nums[i]) count=1;
            else {
                count++;
                max=Math.max(max,count);
            }
        }
        return max;
    }
}