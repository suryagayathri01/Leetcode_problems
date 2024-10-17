class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^0-9a-zA-Z]","");
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)) return false;
        }
        return true;
        
    }
}