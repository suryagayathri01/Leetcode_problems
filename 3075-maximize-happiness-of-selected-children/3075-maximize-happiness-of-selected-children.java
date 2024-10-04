class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long res=0,num;
        int n=happiness.length;
        Arrays.sort(happiness);
        for(int i=0;i<k;i++){
            num=happiness[n-i-1];
            if(num-i < 0){
                res+=0;
            }else{
            res+=num-i;
            }
        }
        return res;
    }
}