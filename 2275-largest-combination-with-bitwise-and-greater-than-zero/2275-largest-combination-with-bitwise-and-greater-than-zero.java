class Solution {
    public int largestCombination(int[] candidates) {
        int[] countbit=new int[24];
        for(int j=0;j<24;j++){
            for(int i:candidates){
                if((i & (1<<j))>0) countbit[j]++;
            }
        }
        int big=0;
        for(int i:countbit){
            if(i>big) big=i;
        }
        return big;


        
    }
}