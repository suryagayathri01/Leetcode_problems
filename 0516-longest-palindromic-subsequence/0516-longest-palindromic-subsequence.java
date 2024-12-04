class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        String st=sb.toString();
        int[][] dp=new int[n+1][n+1];
        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(s.charAt(i)==st.charAt(j)){
                    dp[i][j]=1+dp[i+1][j+1];
                }
                else dp[i][j]=Math.max(dp[i][j+1],dp[i+1][j]);
            }
        }
        return dp[0][0];
        
    }
}