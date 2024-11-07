class Solution {
    public int largestCombination(int[] candidates) {
        List<Integer> countbit=new ArrayList<>(Collections.nCopies(24,0));
        for(int i:candidates){
            String s=String.format("%24s",Integer.toBinaryString(i)).replace(' ','0');
            for(int j=0;j<24;j++){
                if(s.charAt(j)=='1') countbit.set(j,countbit.get(j)+1);
            }
        }
        return Collections.max(countbit);


        
    }
}