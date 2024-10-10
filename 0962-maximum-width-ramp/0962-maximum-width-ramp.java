class Solution {
    public int maxWidthRamp(int[] nums) {
        int more=0;
        int j=nums.length-1;
        for(int i=0;i<j;i++){
            if(nums[i]<=nums[j]){
                return j-i;
            }
        }
        int m=0;
        for(int n=m+1;n<nums.length;n++){
            if(nums[m]<=nums[n]){
                if((n-m)>more){
                    more=n-m;
                }
            }
        }
        return more;
        
    }
}