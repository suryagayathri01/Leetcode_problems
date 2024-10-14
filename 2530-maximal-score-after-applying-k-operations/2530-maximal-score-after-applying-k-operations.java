class Solution {
    public long maxKelements(int[] nums, int k) {
        int flag=0;
        long sum=0L;
        for(long i=0L;i<nums.length;i++){
            if(nums[(int)i]!=nums[0]){
                flag=1;
                break;
            }
        }
        sum=nums[0]*k;
        if(flag==0) return sum;
        else sum=0;
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            maxheap.add(nums[i]);
        }
        for(int i=0;i<k;i++){
            int big=maxheap.poll();
            sum+=big;
            int res=(int)Math.ceil((double)big/3.0);
            maxheap.add(res);
        }

        return sum;
    }
}