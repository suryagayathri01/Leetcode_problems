class Solution {
    public String compressedString(String word) {
        StringBuilder comp=new StringBuilder();
        int count=1;
        for(int i=0;i<word.length();i++){
            if(i<word.length()-1 && word.charAt(i)==word.charAt(i+1)){
                count++;
            }
            else{
                while(count>9){
                    comp.append("9").append(word.charAt(i));
                    count-=9;
                }
                comp.append(count).append(word.charAt(i));
                count=1;
            }
        }
        return comp.toString();

        
    }
}