class Solution {
    public int getLucky(String s, int k) {
        HashMap<Character,Integer> dict=new HashMap<>();
        int sum=0;
        for(char ch: s.toCharArray()){
            int num=ch-'a'+1;
            sum+=num/10+num%10;
        }
        while(k>1){
            int temp=0;
            while(sum>0){
                temp+=sum%10;
                sum=sum/10;
            }
            sum=temp;
            k--;
        }
        return sum;
    }
}