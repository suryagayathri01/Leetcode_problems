class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int n=str1.length(),m=str2.length();
        int j=0,i=0;
        for(i=0;i<n && j<m;i++){
            if(str1.charAt(i) == str2.charAt(j) || str1.charAt(i)+1 ==str2.charAt(j) || str1.charAt(i)-25 ==str2.charAt(j)) 
                j++;
        }
        return m!=j? false:true;
        
    }
}