class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return bound(nums,upper)-bound(nums,lower-1);     
    }
    public long bound(int[] nums,int value){
        long count=0;
        for(int i=0,j=nums.length-1;i<j;++i){
            while(i<j && nums[i]+nums[j]>value){
                --j;         
            }
            count+=j-i;   
        }
        System.out.println(count);
        return count;
    }
}