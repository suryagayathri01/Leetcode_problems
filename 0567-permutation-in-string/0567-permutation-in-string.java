class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int a=s1.length();
        int b=s2.length();
        if(a>b){
            return false;
        }
        if(s2.contains(s1)){
            return true;
        }
        s1=sort(s1);
        for(int i=0;i<b-a;i++){
            if(s1.equals(sort(s2.substring(i,i+a)))){
                return true;
            }
        }
        return false;
    }
    public String sort(String s){
        char[] ss=s.toCharArray();
        Arrays.sort(ss);
        return new String(ss);
    }
}