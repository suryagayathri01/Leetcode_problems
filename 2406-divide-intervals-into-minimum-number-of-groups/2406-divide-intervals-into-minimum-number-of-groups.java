class Solution {
    public int minGroups(int[][] intervals) {
        Map<Integer,Integer> intmap = new HashMap<>();
        for(int[] num:intervals){
            intmap.put(num[0],intmap.getOrDefault(num[0],0)+1);
            intmap.put(num[1]+1,intmap.getOrDefault(num[1]+1,0)-1);
        }
        int maxsum=0;
        int cursum=0;
        for(Map.Entry<Integer,Integer> entry:intmap.entrySet()){
            cursum+=entry.getValue();
            maxsum=Math.max(cursum,maxsum);
        }
        return maxsum;
        
    }
}