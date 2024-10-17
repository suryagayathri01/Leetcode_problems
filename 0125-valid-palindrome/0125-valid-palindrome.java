class Solution {
    public boolean isPalindrome(String s) {
        s=s.strip();
        s=s.toLowerCase();
        s=s.replaceAll("[^0-9a-zA-Z]","");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        }
        return true;
        
    }
}