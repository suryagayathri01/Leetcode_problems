class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int res=0;
        for(String i:words){
            int flag=0;
            for(int j=0;j<i.length();j++){
                if(!allowed.contains(String.valueOf(i.charAt(j)))){
                    flag=1;
                }
                if(flag==1)
                    break;
            }
            if(flag==0){
                res++;
            }
        }
        return res;
        
    }
}