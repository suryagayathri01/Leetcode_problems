class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        int[] scorecopy=Arrays.copyOf(score,n);
        Map<Integer,Integer> rankmap = new HashMap<>();
        for(int i=0;i<n;i++){
            rankmap.put(score[i],i);
        }
        Arrays.sort(scorecopy);
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            if(i==0){
                str[rankmap.get(scorecopy[n-i-1])]="Gold Medal";
            }
            else if(i==1){
                str[rankmap.get(scorecopy[n-i-1])]="Silver Medal";
            }
            else if(i==2){
                str[rankmap.get(scorecopy[n-i-1])]="Bronze Medal";
            }
            else{
                str[rankmap.get(scorecopy[n-i-1])]=Integer.toString(i+1);
            }
        }
        return str;


         

        
    }
}