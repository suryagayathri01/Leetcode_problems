class Solution {
    public int maxUniqueSplit(String s) {
        Set<String> seen=new HashSet<>();
        return Backtrack(s,0,seen);
        
    }
    public int Backtrack(String s,int start,Set<String> seen){
        if(start==s.length()) return 0;
        int count=0;
        for(int end=start+1;end<=s.length();++end){
            String sub=s.substring(start,end);
            if(!seen.contains(sub)){
                seen.add(sub);
                count=Math.max(count,1+Backtrack(s,end,seen));
                seen.remove(sub);
            }
            
        }
        return count;
    }
}