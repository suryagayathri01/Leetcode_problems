class Solution {
    public int minBitFlips(int start, int goal) {
        String bstart= Integer.toBinaryString(start);
        String bgoal= Integer.toBinaryString(goal);
        int maxlen= Math.max(bstart.length(),bgoal.length());
        
        bstart=bstart.format("%"+maxlen+"s",bstart).replace(" ","0");
        bgoal=bgoal.format("%"+maxlen+"s",bgoal).replace(" ","0");
        
        int res=0;
        for(int i=0;i<maxlen;i++){
            if(bstart.charAt(i) != bgoal.charAt(i)){
                res++;
            }
        }
        return res;
        
    }
}