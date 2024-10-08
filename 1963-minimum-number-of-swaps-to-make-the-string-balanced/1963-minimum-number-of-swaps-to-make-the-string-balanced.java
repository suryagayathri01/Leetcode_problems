class Solution {
    public int minSwaps(String s) {
        int n=s.length();
        int swaps=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='['){
                swaps++;
            }
            else if(ch==']'){
                if(swaps>0){
                    swaps--;
                }
            }
        }
        return ((swaps+1)/2);

        
    }
}