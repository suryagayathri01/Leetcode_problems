class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Set<List<Integer>> set=new HashSet<>();
        Arrays.sort(nums);
        int sum;
        for(int i=0;i<nums.length-1;i++){
            int j=i+1, k=nums.length-1;
            while(i!=j && j!=k && i!=k){
                sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    System.out.println(set);
                    j++;
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }

            }
        }
        list.addAll(set);
        return list;

        


        
    }
}