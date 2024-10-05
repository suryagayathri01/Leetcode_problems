class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int z=x;
        int len=String.valueOf(x).length();
        if(len==2){
            if(x/10 == x%10){
                return true;
            }
        }
        int y=0;
        for(int i=0;i<len;i++){
            int flag=x%10;
            y=(y*10)+flag;
            x/=10;
        }
        if(y==z)
            return true;
        return false;
    }
}