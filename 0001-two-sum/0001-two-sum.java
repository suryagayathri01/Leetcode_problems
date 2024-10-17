class Solution {
    public int[] twoSum(int[] nums, int target) {
        int j = nums.length-1;
        int i=0;
        int[] res=new int[2];
        int[] index=new int[j+1];
        for(int k=0;k<=j;k++){
            index[k]=k;
        }
        while(i<nums.length){
            if(nums[i]==target){
                res[0]=index[i];
                if(nums[j]==target){
                    res[1]=index[j];
                }
                return res;
            }
            if(nums[j]==target){
                res[0]=index[j];
                return res;
            }
            int sum=nums[i]+nums[j];
            if(sum==target && i!=j){
                res[0]=index[i];res[1]=index[j];
                return res;
            }
            else if(sum>target && nums[i]>=0 && nums[j]>=0) j--;
            else if(sum<target && nums[i]>=0 && nums[j]>=0) i++;
            else if(sum>target && nums[i]<0 || nums[j]<0) i++;
            else if(sum<target && nums[i]<0 || nums[j]<0) j--;
        }
        return res;

        
    }
}