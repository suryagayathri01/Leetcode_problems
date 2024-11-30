class Solution {
    public int rob(int[] nums) {
        int i=0,j=0;
        for(int num:nums){
            int curr=Math.max(i,j+num);
            j=i;
            i=curr;
        }
        return i;
        
    }
}