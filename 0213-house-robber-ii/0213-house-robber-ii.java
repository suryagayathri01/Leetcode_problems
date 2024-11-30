class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        return Math.max(check(nums,0,n-1),check(nums,1,n));
    }
    private int check(int[] nums,int start,int stop){
        int i=0,j=0;
        for(int k=start;k<stop;k++){
            int curr=Math.max(i,j+nums[k]);
            j=i;
            i=curr;
        }
        return i;
    }
}