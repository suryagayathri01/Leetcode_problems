class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int[] lcis=new int[nums.length];
        for(int i=0;i<lcis.length;i++) lcis[i]++;

        for(int i=nums.length-1;i>=0;i--){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j] && (j-i==1)){
                    lcis[i]=Math.max(lcis[i],1+lcis[j]);
                }
            }
        }
        int max=lcis[0];
        for(int i=1;i<lcis.length;i++) max=Math.max(max,lcis[i]);
        return max;
    }
}