class Solution {
    public int largestCombination(int[] candidates) {
        int[] countbit=new int[24];
        for(int i:candidates){
            String s=String.format("%24s",Integer.toBinaryString(i)).replace(' ','0');
            for(int j=0;j<24;j++){
                if(s.charAt(j)=='1') countbit[j]++;
            }
        }
        int big=0;
        for(int i:countbit){
            if(i>big) big=i;
        }
        return big;


        
    }
}