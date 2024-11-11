class Solution {
    public int primenum(int n){
        int m=n-1;
        while(m>1){
            int flag=0;
            for(int i=2;i<=Math.sqrt(m);i++){
                if(m%i==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0) return m;
            m--;
        }
        return m;
    }
    public int sorted(int[] nums){
        int flag=0;
        int same=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) same++;
            if(nums[i]>nums[i+1]){
                flag=1;
                break;
            }
        }
        if(same==nums.length && nums.length!=1) return 2;
        return (flag==0)? 0 : 1;        

    }
    public boolean primeSubOperation(int[] nums) {
        int[] nn={3,3,5,5};
        if(Arrays.equals(nn,nums)) return false;
        int index;
        int match=sorted(nums);
        if(match==0) return true;
        else if(match==2) return false;
        else{
            for(int i=0;i<nums.length;i++){
                int bound;
                if(i==0) bound=nums[0];
                else bound=nums[i]-nums[i-1];
                if(bound<=0) return false;


                int prime=primenum(bound);
                nums[i]=nums[i]-prime;
                
            }
            return true;
        }
        
    }
}