class Solution {
    public int minAddToMakeValid(String s) {
        int out=0,res=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                out++;
            }
            else if(c==')'){
                if(out>0){
                    out--;
                }
                else{
                    res++;
                }
            }
        }
        return out+res;
        
    }
}