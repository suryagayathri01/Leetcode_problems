class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder sfinal=findString(n);
        StringBuilder newfinal= new StringBuilder().append(sfinal).append(new StringBuilder("1")).append(rev(invert(sfinal)));
        return newfinal.charAt(k-1);
    }
    public StringBuilder findString(int i){
        if(i==1) return new StringBuilder("0");
        if(i==2) return new StringBuilder("011");

        StringBuilder st=findString(i-1);
        StringBuilder newS= new StringBuilder().append(st).append(new StringBuilder("1")).append(rev(invert(st)));
        return newS;
    }
    public StringBuilder invert(StringBuilder s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0') s.setCharAt(i,'1');
            else s.setCharAt(i,'0');
        }
        return s;
    }
    public StringBuilder rev(StringBuilder st){
        int len=st.length();
        StringBuilder newst=new StringBuilder();
        for(int i=len-1;i>=0;i--){
            newst.append(st.charAt(i));
        }
        return newst;
    }
}