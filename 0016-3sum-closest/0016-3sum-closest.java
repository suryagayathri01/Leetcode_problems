class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int close=999999999;
        int res=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int j=i+1,k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                int diff=Math.abs(target-sum);
                if(diff<close){
                    close=diff;
                    res=sum;
                }
                if(sum<target){
                    j++;
                }
                else if(sum>target){
                    k--;
                }
                else{
                    return sum;
                }
                
            }
        }
        return res;
        
    }
}