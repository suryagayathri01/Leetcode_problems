class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long count=0;
        for(int i=0;i<nums.length;i++){
            long low=bound(nums,i+1,nums.length-1,lower-nums[i]);
            long high=bound(nums,i+1,nums.length-1,upper-nums[i]+1);
            count+=1*(high-low);
        }
        return count;        
    }
    public long bound(int[] nums,int left,int right,int value){
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid] < value) left=mid+1;
            else right=mid-1;
        }
        return left;        
    }
}